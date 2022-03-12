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



-- schema master
INSERT INTO master.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (1, '1', '1', '2022-03-12', '2022-03-12 18:22:48', 1111, '111', null);
INSERT INTO master.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (2, '2', '2', '2022-03-12', '2022-03-12 18:23:05', 222, '222', null);

INSERT INTO master.t_order (ID, order_no, acc_id, total_amount, creat_time, cancel_time, reach_date, mark) VALUES (1, '111', 11, 11, '2022-03-13 16:37:13', '2022-03-12 16:37:15', '2022-03-12', null);

-- schema slave
INSERT INTO slave.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (1, 'TEST', '11', '2022-03-12', '2022-03-12 16:37:31', 111, null, null);

