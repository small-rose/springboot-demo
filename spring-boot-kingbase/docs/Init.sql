-- Mysql

create table t_account
(
    ID          BIGINT primary key auto_increment          not  null comment 'id',
    NAME        varchar(20)                         null comment '账户名称',
    PASS        varchar(20)                         null comment '账户密码',
    ADD_DATE    date                                null comment '创建日期',
    LAST_LOGIN  timestamp default CURRENT_TIMESTAMP null comment '最后登录时间',
    BALANCE     decimal   default 0                 null comment '账户余额',
    DESCRIPTION text                                null comment '自我介绍',
    HEAD_IMAGE  blob                                null comment '个人头像',
    constraint t_account_ID_uindex
        unique (ID)
)
    comment '账户表';


create table t_order
(
    ID         bigint  primary key auto_increment               not  null comment 'id',
    order_no      varchar(20)                         null comment '订单号',
    acc_id        BIGINT(20)                          null comment '账户id',
    total_amount  decimal   default 0                 null comment '订单总金额',
    creat_time    timestamp default CURRENT_TIMESTAMP null comment '订单创建时间',
    cancel_time   timestamp                          null comment '订单取消时间',
    reach_date    date                               null comment '订单送达日期',
    mark    text                                null comment '备注'
)
    comment '模拟订单表';

---- mysql 5.7


---- kingbse v8 oracle 模式

CREATE TABLE bp_dev.T_ACCOUNT (
	ID BIGSERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(20) NULL,
	PASS VARCHAR(20) NULL,
	ADD_DATE DATE NULL,
	LAST_LOGIN TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	BALANCE DECIMAL NULL DEFAULT 0,
	DESCRIPTION TEXT NULL,
	HEAD_IMAGE BYTEA NULL
);

ALTER TABLE bp_dev.T_ACCOUNT
	ADD CONSTRAINT t_account_ID_uindex UNIQUE (ID);

CREATE TABLE bp_dev.T_ORDER (
	ID BIGSERIAL PRIMARY KEY NOT NULL,
	order_no VARCHAR(20) NULL,
	acc_id BIGINT NULL,
	total_amount DECIMAL NULL DEFAULT 0,
	creat_time TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	cancel_time TIMESTAMP NULL,
	reach_date DATE NULL,
	mark TEXT NULL
);

COMMENT ON TABLE bp_dev.T_ACCOUNT IS '账户表';

COMMENT ON COLUMN bp_dev.T_ACCOUNT.ID IS 'id';

COMMENT ON COLUMN bp_dev.T_ACCOUNT.NAME IS '账户名称';

COMMENT ON COLUMN bp_dev.T_ACCOUNT.PASS IS '账户密码';

COMMENT ON COLUMN bp_dev.T_ACCOUNT.ADD_DATE IS '创建日期';

COMMENT ON COLUMN bp_dev.T_ACCOUNT.LAST_LOGIN IS '最后登录时间';

COMMENT ON COLUMN bp_dev.T_ACCOUNT.BALANCE IS '账户余额';

COMMENT ON COLUMN bp_dev.T_ACCOUNT.DESCRIPTION IS '自我介绍';

COMMENT ON COLUMN bp_dev.T_ACCOUNT.HEAD_IMAGE IS '个人头像';

COMMENT ON TABLE bp_dev.T_ORDER IS '模拟订单表';

COMMENT ON COLUMN bp_dev.T_ORDER.ID IS 'id';

COMMENT ON COLUMN bp_dev.T_ORDER.ORDER_NO IS '订单号';

COMMENT ON COLUMN bp_dev.T_ORDER.ACC_ID IS '账户id';

COMMENT ON COLUMN bp_dev.T_ORDER.TOTAL_AMOUNT IS '订单总金额';

COMMENT ON COLUMN bp_dev.T_ORDER.CREAT_TIME IS '订单创建时间';

COMMENT ON COLUMN bp_dev.T_ORDER.CANCEL_TIME IS '订单取消时间';

COMMENT ON COLUMN bp_dev.T_ORDER.REACH_DATE IS '订单送达日期';

COMMENT ON COLUMN bp_dev.T_ORDER.MARK IS '备注';


------