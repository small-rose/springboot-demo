create table mm_batch_task_td
(
    id              int auto_increment
        primary key,
    bean_name       varchar(255) null,
    created_time    datetime     null,
    creator_id      int          null,
    creator_name    varchar(255) null,
    cron_expression varchar(255) null,
    delete_flag     int          null,
    job_name        varchar(255) null,
    method_name     varchar(255) null,
    status          int          null,
    updated_time    datetime     null
);


INSERT INTO db_quartz.mm_batch_task_td (id, bean_name, created_time, creator_id, creator_name, cron_expression, delete_flag, job_name, method_name, status, updated_time) VALUES (1, 'testJob01', '2022-01-18 20:34:31', 1, 'zzy', '0/5 * * * * ?', 0, 'TestJob01', 'execute', 0, null);
INSERT INTO db_quartz.mm_batch_task_td (id, bean_name, created_time, creator_id, creator_name, cron_expression, delete_flag, job_name, method_name, status, updated_time) VALUES (2, 'testJob02', '2022-01-18 20:38:49', 2, 'zzy', '0/6 * * * * ?', 0, 'TestJob02', 'outTime', 0, null);