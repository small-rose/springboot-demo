-- 业务数据权限
create table mm_bizprivilege_cover_td
(
    SUBCOMPANY       varchar(20)                          not null comment '分公司代码',
    OPCODE           varchar(30)                          not null comment '人员代码',
    DEPARTMENTCODE   varchar(50)                          not null comment '业务部门代码',
    POWERMARK        char                                 not null comment '查询权限(查询模块中用查询权限sqlstring1，把POWERMARK>=1的内容拼成sql 生产模块中用操作权限sqlstring2，把POWERMARK=2的内容拼成sql    比如： 账户余额查询用查询权限，收款操作查账户用操作权限； 台帐查询用部门查询权限，收款查保单用部门操作权限)',
    TIMESTAMP        datetime   default CURRENT_TIMESTAMP not null comment '时间戳',
    HIBERNATEVERSION decimal(6) default 0                 not null comment 'HIBERNATE版本号',
    LASTOPDATE       datetime   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '最后操作日期',
    MODIFYDESC       text                                 null comment '手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据',
    BAKPOWERMARK     varchar(1)                           null comment '后备权限',
    STATUS           char                                 not null comment '状态',
    ID               bigint unsigned                      not null
        primary key,
    constraint idx_pri_2
        unique (OPCODE, DEPARTMENTCODE)
)
    comment '业务权限表';

create index MM_BIZPRIVILEGE_COVER_TD01
    on mm_bizprivilege_cover_td (OPCODE, POWERMARK, DEPARTMENTCODE);

-- 分公司权限
create table mm_bizsub_cover_td
(
    SUBCOMPANY       varchar(30)                          not null comment '分公司代码',
    OPCODE           varchar(30)                          not null comment '人员代码',
    TIMESTAMP        datetime   default CURRENT_TIMESTAMP not null comment '时间戳',
    HIBERNATEVERSION decimal(6) default 0                 not null comment 'HIBERNATE版本号',
    MODIFYDESC       text                                 null comment '手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据',
    ID               bigint(64) unsigned                  not null
        primary key,
    constraint idx_pri_2
        unique (SUBCOMPANY, OPCODE)
)
    comment '人员分公司权限表';

create table mm_payablemoney_td
(
    PAYABLENO            bigint(30) unsigned                           not null comment '待付款流水号'
        primary key,
    PAYABLESEQ           bigint(30) unsigned default 0                 not null comment '待付款批次号',
    DATATYPE             varchar(10)                                   not null comment '用于区分数据的来源和后续处理的业务类型， 参见业务类型表中已挂待付款XX的业务类别',
    FATHERNO             bigint(30) unsigned                           null comment '比如赔案挂待付款写赔案的流水号，预收转待付款写预收的流水号，如果是多笔转过来则写9999999999即可',
    SUMMARYNO            varchar(60)                                   null comment '储金返还的数据会有小汇总号 手续费数据的提取单号也放在这里边 车船税的申报单号也写在这里边',
    SUBCOMPANY           varchar(20)                                   not null comment '分公司代码',
    UNITCODE             varchar(20)                                   not null comment '财务机构代码',
    CURRENCYCODE         varchar(10)                                   not null comment '币种（记账币种）',
    AMOUNT               decimal(16, 2)                                not null comment '金额（记账币种）',
    USEDAMOUNT           decimal(16, 2)                                not null comment '已处理金额（记账币种）',
    BASECURRENCYCODE     varchar(10)                                   not null comment '币种（保单币种），备用',
    BASEAMOUNT           decimal(16, 2)                                not null comment '金额（保单币种），备用',
    BASEUSEDAMOUNT       decimal(16, 2)                                not null comment '已处理金额（保单币种），备用',
    CUSTOMERCODE         varchar(100)                                  not null comment '客户代码',
    CUSTOMERNAME         varchar(100)                                  null comment '客户名称（中文）',
    OPSTATUS             varchar(1)          default '0'               not null comment '0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  9 未审核（审核标记）;0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）',
    OPDATE               date                                          null comment '操作日期',
    OPCODE               varchar(15)                                   not null comment '操作员代码',
    LASTOPDATE           datetime                                      null comment '系统时间',
    DEPARTMENTCODE       varchar(20)                                   not null comment '业务部门代码',
    AGENTCODE            varchar(100)                                  null comment '代理点代码',
    DESCRIPTION          text                                          null comment '业务系统对结算信息的额外描述。由前端录入。',
    POLICYNO             varchar(80)                                   null comment '保单号',
    ENDORSENO            varchar(80)                                   null comment '批单号',
    CLASSESCODE          varchar(8)                                    null comment '业务险种',
    RISKTYPE             char(2)                                       null comment '风险类别',
    CUSTACCOUNTNO        text                                          null comment '客户银行代码',
    BANKNAME             varchar(180)                                  null comment '开户行银行名称',
    CUSTBANKNO           varchar(30)                                   null comment '客户开户行代码（开户行联行号）',
    CLAIMNO              varchar(80)                                   null comment '赔案号',
    RETURNNO             varchar(20)                                   null comment '储金返还序号',
    CANCELDATE           datetime                                      null comment '此记录被作废的系统时间',
    DATASOURCE           varchar(30)         default 'paymentreceive'  not null comment '含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history ',
    CANCELFLAG           char                default '0'               not null comment '取消标识',
    TIMESTAMP            datetime            default CURRENT_TIMESTAMP not null comment '时间戳',
    PAYTYPE              char                                          null comment 'PAYTYPE是对应DATATYPE的大类。对于付款： 1=赔款，DATATYPE包含{ "302", "304", "308", "311", "313", "315", "317", "319", "321" }；2=退保，DATATYPE包含{ "101", "103", "107" }；3=退储{ "201", "204", "206" }，DATATYPE包含；4=储金返还，DATATYPE包含{ "208" }；5=其他应付款，DATATYPE包含{ "407" }；6=手续费，DATATYPE包含{ "502", "504", "508", "512", "514" }',
    HIBERNATEVERSION     decimal(6)          default 1                 not null comment 'hibernate版本号',
    IFEFFECT             varchar(1)          default '1'               not null comment '用于区分退保挂待付的时候是否已经生效 0 未生效 1已生效',
    SERIALNO             varchar(60)                                   null comment '赔款=赔案的赔付序号,手续费=手续费序号',
    CARDPOLICYNO         varchar(80)                                   null comment '卡式保单冲销号',
    WAITPAYNO            varchar(60)                                   null comment '期初迁移的数据在老系统的待付款流水号',
    CUSTSEQ              varchar(60)                                   null comment '一次赔付的多个客户的序号',
    INPAYMENTBATCHNO     text                                          null comment '票据用途，对应payment.zpyt',
    BUSINESSATTR         varchar(3)          default '0'               not null comment '业务性质',
    MODIFYDESC           text                                          null comment '手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据',
    TRANSACTORCODE       varchar(15)                                   null comment '经办人，落地时插入',
    INPAYMENTDEPARTMENT  varchar(10)                                   null comment '指定收付款机构',
    CLOSEAMOUNT          decimal(16, 2)                                null comment '预约保单、卡式保单已冲销金额（记账币种）',
    BASECLOSEAMOUNT      decimal(16, 2)                                null comment '预约保单、卡式保单已冲销金额（保单币种）',
    HASCOINS             varchar(1)                                    null comment '是否共联保',
    HASPLAN              varchar(1)                                    null comment '是否分期',
    HASFEE               varchar(1)                                    null comment '是否见费出单',
    INSUREDCODE          text                                          null comment '被保险人代码',
    INSUREDNAME          text                                          null comment '被保险人名称（中文）',
    INSUREDNAMEEN        text                                          null comment '收付交易数据的被保险人名称（英文）',
    INSUREDPARTYNO       text                                          null comment '保单上的被保险人partyno',
    APPLICANTCODE        text                                          null comment '保单上的投保人代码',
    APPLICANTNAMECN      text                                          null comment '收付交易数据的投保人中文名称',
    APPLICANTNAMEEN      text                                          null comment '收付交易数据的投保人英文名称',
    APPLICANTIONPARTYNO  text                                          null comment '保单上的投保人partyno',
    APPISJAPAN           char                                          null comment '投保人是否为日系客户     0：非日系 1：日系',
    DOMESTIC             varchar(30)                                   null comment '境内/境外标识  0 境外  1 境内',
    PORTTYPE             varchar(2)                                    null comment '进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 ',
    BILLNO               varchar(100)                                  null comment '账单号',
    OFFSETNO             varchar(60)                                   null comment '冲销号 为红冲数据，所红冲原记录的唯一流水号',
    PLANDATE             datetime                                      null comment '计划缴费日期',
    CUSTOMERNAMEEN       text                                          null comment '收付交易数据的客户名称（英文',
    CUSTOMERPARTYNO      varchar(100)                                  null comment '客户partyno',
    CUSTISJAPAN          varchar(30)                                   null comment '收付交易数据的客户是否为日系客户',
    AGENTNAMECN          text                                          null comment '代理点/经纪公司名称（中文）',
    AGENTNAMEEN          text                                          null comment '代理点/经纪公司名称（英文）',
    AGENTPARTYNO         text                                          null comment '代理点/经纪公司partyno',
    CUSTACCOUNTNAME      text                                          null comment '客户账户名称',
    CUSTACCOUNTNAMEEN    text                                          null comment '客户账户名称(英文)',
    CHARGEDESCRIPTION    varchar(30)                                   null comment '理赔费用类型描述',
    BUSINESSCHANNEL      varchar(30)                                   null comment '展业渠道',
    CONTRACTTYPE         varchar(100)                                  null comment '合同类型',
    INSURANCETERM        varchar(100)                                  null comment '承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期',
    CLASSESKIND          varchar(100)                                  null comment '险类',
    CONFIRMSEQUENCENO    varchar(50)                                   null comment '投保确认码',
    IFUPLOAD             varchar(1)                                    null comment '上传标志 0 不上传 1上传',
    FARMFLAG             varchar(50)                                   null comment '涉农标志',
    INVOICEAMOUNT        decimal(16, 2)                                null comment '发票开票金额',
    DAMAGEDATE           datetime                                      null comment '出险时间',
    CLAIMTYPE            varchar(30)                                   null comment '是否预付赔款,0不是预付，1是预付',
    BANKPROVINCE         varchar(30)                                   null comment '客户开户行所在省份',
    BANKCITY             varchar(100)                                  null comment '客户开户行所在市',
    BANKTYPE             varchar(100)                                  null comment '客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）',
    ISPAYPUBLIC          varchar(3)                                    null comment '银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)',
    BILLCODE             varchar(200)                                  null comment '对接资金账单号',
    IFBILLBACK           varchar(3)                                    null comment '是否退票0：未退票 1：已退票',
    PAYCODE              varchar(60)                                   null comment '支付号，此字段目前只用来记录手续费的支付号',
    PROPORTIONAMOUNT     decimal(16, 2)                                null comment '应付比例金额,只用于分期缴费保单的赔款数据',
    CLAIMADDCODE         varchar(50)                                   null comment '结案追加码',
    SETTLEMENTNO         varchar(80)                                   null comment '手工结算单号，小币种结算单场景使用本字段',
    PAYMENTMETHOD        varchar(2)                                    null comment '支付方式： 51 现金付款、 52 银行转账付款、53支票付款
',
    EXSTATUS             varchar(2)                                    null comment '例外状态：0-正常，1-支付至责任保险第三者，2-法院判决，3-共保业务，4-交强险垫/预付，5-车辆过户，6-其他。',
    EXCEPTIONCAUSE       text                                          null comment '针对“例外状态”的说明',
    IFLOCAL              varchar(1)                                    null comment '异地标识',
    MOBILENUMBER         varchar(15)                                   null comment '客户手机号',
    REPORTCASENO         varchar(80)                                   null comment '报案号',
    CHECKSTATUS          char                default '0'               null comment '审核状态',
    CHECKCODE            varchar(15)                                   null comment '审核人员',
    CHECKDATE            datetime                                      null comment '审核时间',
    CHECKCONTENT         text                                          null comment '审核意见',
    SOURCENO             decimal(30)                                   null comment '业务来源表的主键',
    REMARK               text                                          null comment '备注',
    CARDFLAG             varchar(1)                                    null comment '卡折标志',
    CERTIFICATETYPE      varchar(10)                                   null comment '证件类型',
    CERTIFICATENO        varchar(100)                                  null comment '证件号码',
    CUSTEMAIL            varchar(100)                                  null comment '客户电子邮箱',
    VEHICLENO            varchar(60)                                   null comment '车牌号',
    PAIRNO               varchar(30)                                   null comment '配对编号',
    BANKAREA             varchar(64)                                   null comment '客户开户行的银行区域代码',
    CERTITYPE            varchar(2)                                    null comment '业务类型.业务类型,1:保单,2:赔案,3:手续费,5:再保结算单,6:赔款结算单',
    FASTFLAG             varchar(1)                                    null comment '加急标志。  "0 - 普通 1 - 加急"',
    SMSFLAG              varchar(1)                                    null comment '短信通知标志',
    CUSTAGENTBANKNAME    text                                          null comment '客户代理银行名称',
    CUSTAGENTBANKADDR    text                                          null comment '客户代理银行地址',
    CUSTADDRESS          text                                          null comment '客户地址',
    CUSTCOUNTRYNAME      text                                          null comment '客户常驻国家名称',
    CUSTCOUNTRYCODE      varchar(10)                                   null comment '客户常驻国家代码',
    CUSTAGENTACCOUNTNO   text                                          null comment '客户银行在代理银行的帐号',
    OPERATORCODE         varchar(50)                                   null comment '制单人工号',
    OPERATORNAME         varchar(100)                                  null comment '制单人名称',
    ISSPLITTED           varchar(1)                                    null comment '是否做子险拆分 0 不拆分 1拆分',
    CUSTACCOUNTAREA      varchar(10)                                   null comment '客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外',
    CUSTBANKADDR         text                                          null comment '客户银行地址，境外汇款时使用',
    CUSTBANKSWIFTCODE    varchar(50)                                   null comment 'Swift Code：即国际银行代码，境外汇款时使用',
    CUSTCHARGETYPE       varchar(10)                                   null comment '国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA',
    EXCHANGERATE         decimal(16, 8)                                null comment ' 汇率',
    IFPRECOST            varchar(1)                                    null comment '是否预结手续费，卡单预结手续费时必填，0 否，1 是',
    CERTINO              varchar(60)                                   null comment '计算书号',
    PAYBATCHNO           varchar(60)                                   null comment '理赔赔付批次号',
    COINSURNO            varchar(60)                                   null comment '联共保号',
    EXCHANGECURRENCYCODE varchar(60)                                   null comment '兑换币种',
    EXCHANGEAMOUNT       decimal(16, 2)                                null comment '兑换金额',
    BASETAXESAMOUNT      decimal(16, 2)                                null comment '保单币种税额',
    TAXESAMOUNT          decimal(16, 2)                                null comment '结算币种税额',
    BUSINESSNO           varchar(30)                                   null comment '投保单号/批改申请单号',
    BUSINESSSOURCE       varchar(10)                                   null comment '业务来源',
    CUSTOMERTYPE         varchar(10)                                   null comment '客户类型',
    TOTALSERIALNO        varchar(60)                                   null comment '帐单序号',
    GROUPFLAG            varchar(10)                                   null comment '个团标志',
    GROUPTYPE            varchar(10)                                   null comment '团队类型',
    BATCHNUMBER          varchar(30)                                   null comment '报批号',
    OUTDATASOURCE        varchar(30)                                   null comment '外部系统来源',
    CUSTOMERSOURCE       varchar(30)                                   null comment '客户来源',
    AGENTTYPE            varchar(2)                                    null comment '代理人类型',
    FARMFLAGCODE         varchar(100)                                  null comment '涉农类别',
    PREMIUMSOURCE        varchar(30)                                   null comment '保费补贴来源编码',
    USEPORPERTY          varchar(30)                                   null comment '车辆使用性质',
    VEHKIND              varchar(8)                                    null comment '车辆种类',
    CHARACTERISTICS      varchar(100)                                  null comment '车辆规格特性',
    FARPOLICYTYPE        varchar(1)                                    null comment '农业险政策性',
    SETTLEMENTTYPE       varchar(1)                                    null comment '结算类型：0 无票支付  1 有票支付 2 先支付后开票',
    CARUSETYPE           varchar(10)                                   null comment '车辆用途',
    CONFIRMAMOUNT        decimal(16, 2)                                null comment '无红票退款不退税金额',
    MAINPOLICYNO         varchar(60)                                   null comment '主保单号',
    CONFIRMSTATUS        varchar(2)                                    null comment '无红票退款确认状态 1 未确认 2已确认',
    TAXESAMOUNT1         decimal(16, 6)                                null comment '税金金额，保留6位数',
    CUSTBANKNAME         varchar(10)                                   null comment '开户行联行号名称',
    businessBelong       varchar(1)                                    null comment '结算手续费业务归属0 车险 1 团险 2 个险'
)
    comment '退保、退储、储金返还和赔案等挂为待付款时，在本表插入一条记录。不明到款不在本表记录 收款放其他应付款  *暂不考虑多币种支持问题  以分公司进行范围分区存储';

create index IDX_PAYABLEMONEY_NEW_01
    on mm_payablemoney_td (OPSTATUS, OPDATE, CUSTOMERNAME, DATATYPE);

create index IDX_PAYABLEMONEY_NEW_02
    on mm_payablemoney_td (CUSTSEQ);

create index IDX_PAYABLEMONEY_NEW_03
    on mm_payablemoney_td (OPCODE, OPDATE, AMOUNT, OPSTATUS);

create index IDX_PAYABLEMONEY_NEW_04
    on mm_payablemoney_td (POLICYNO);

create index IDX_PAYABLEMONEY_NEW_05
    on mm_payablemoney_td (PAYABLENO, OPSTATUS)
    comment '20210609添加，核销状态更新时使用';

create index IDX_PAYABLEMONEY_NEW_06
    on mm_payablemoney_td (SUMMARYNO)
    comment '结算单号';

create index IDX_PAYABLEMONEY_NEW_11
    on mm_payablemoney_td (DATATYPE, OPSTATUS, FATHERNO);

create index IND_T1_NEW
    on mm_payablemoney_td (FATHERNO);

