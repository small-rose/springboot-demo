
create schema bp_demo collate utf8mb4_general_ci;

-- auto-generated definition
create table t_account
(
    ID          bigint auto_increment,
    NAME        varchar(20)                         null comment '账户名称',
    PASS        varchar(20)                         null comment '账户密码',
    ADD_DATE    date                                null comment '创建日期',
    LAST_LOGIN  timestamp default CURRENT_TIMESTAMP null comment '最后登录时间',
    BALANCE     decimal(15,2)   default 0                 null comment '账户余额',
    DESCRIPTION text                                null comment '自我介绍',
    HEAD_IMAGE  blob                                null comment '个人头像',
    constraint t_account_ID_uindex
        unique (ID)
)
    comment '账户表';

alter table t_account
    add primary key (ID);

INSERT INTO bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (1, 'Tom', '123', '2022-03-01', '2022-03-01 10:01:09', 100, '我是Tom', null);
INSERT INTO bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (2, '孙大圣', '123', '2022-03-01', '2022-03-01 10:01:44', 1000, '齐天大圣', null);
INSERT INTO bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (3, '朱老二', '123', '2022-03-01', '2022-03-01 10:02:14', 500, '高老庄总管', null);
INSERT INTO bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (4, '唐诗人', '456', '2022-03-01', '2022-03-01 10:02:57', 120, '无名诗人', null);
INSERT INTO bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (5, '宋词人', '456', '2022-03-01', '2022-03-01 10:04:00', 240, '宋朝词人', null);
INSERT INTO bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (6, '元好问', '123', '2022-03-01', '2022-03-01 10:05:37', 560, '考生', null);
INSERT INTO bp_demo.t_account (ID, NAME, PASS, ADD_DATE, LAST_LOGIN, BALANCE, DESCRIPTION, HEAD_IMAGE) VALUES (7, '开发01', '456', '2022-03-01', '2022-03-01 10:07:01', 600, null, null);



create table t_log
(
    id     bigint(30)                          null,
    name   varchar(20)                         null,
    opt    varchar(100)                        null,
    opdate timestamp default CURRENT_TIMESTAMP null
);

