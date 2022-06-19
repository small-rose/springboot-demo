
create schema bp_demo collate utf8mb4_general_ci;

create table t_account
(
    ID          bigint auto_increment,
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

alter table t_account
    add primary key (ID);

create table t_order
(
    ID           bigint auto_increment comment 'id'
        primary key,
    order_no     varchar(20)                         null comment '订单号',
    acc_id       bigint                              null comment '账户id',
    total_amount decimal   default 0                 null comment '订单总金额',
    creat_time   timestamp default CURRENT_TIMESTAMP null comment '订单创建时间',
    cancel_time  timestamp                           null comment '订单取消时间',
    reach_date   date                                null comment '订单送达日期',
    mark         text                                null comment '备注'
)
    comment '模拟订单表';

create table t_user
(
    id    int auto_increment
        primary key,
    name  varchar(30) null,
    phone varchar(15) null
);




insert into bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) values (1, 'Tom', '123', '2022-03-01', '2022-03-01 10:01:09', 100, '我是Tom', null);
insert into bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) values (2, '孙大圣', '123', '2022-03-01', '2022-03-01 10:01:44', 1000, '齐天大圣', null);
insert into bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) values (3, '朱老二', '123', '2022-03-01', '2022-03-01 10:02:14', 500, '高老庄总管', null);
insert into bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) values (4, '唐诗人', '456', '2022-03-01', '2022-03-01 10:02:57', 120, '无名诗人', null);
insert into bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) values (5, '宋词人', '456', '2022-03-01', '2022-03-01 10:04:00', 240, '宋朝词人', null);
insert into bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) values (6, '元好问', '123', '2022-03-01', '2022-03-01 10:05:37', 560, '考生', null);
insert into bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) values (7, '开发01', '456', '2022-03-01', '2022-03-01 10:07:01', 600, null, null);


INSERT INTO bp_demo.t_order (ID, order_no, acc_id, total_amount, creat_time, cancel_time, reach_date, mark) VALUES (1, '202204190001', 1, 100, '2022-04-19 10:53:25', null, '2022-04-20', null);
INSERT INTO bp_demo.t_order (ID, order_no, acc_id, total_amount, creat_time, cancel_time, reach_date, mark) VALUES (2, '202204190002', 1, 103, '2022-04-19 10:53:50', null, '2022-04-20', null);
INSERT INTO bp_demo.t_order (ID, order_no, acc_id, total_amount, creat_time, cancel_time, reach_date, mark) VALUES (3, '202204190003', 2, 50, '2022-04-19 10:54:20', null, '2022-04-20', null);
INSERT INTO bp_demo.t_order (ID, order_no, acc_id, total_amount, creat_time, cancel_time, reach_date, mark) VALUES (4, '202204190004', 3, 34, '2022-04-19 10:54:59', null, '2022-04-21', null);

