-- auto-generated definition
create table employee
(
    id       int auto_increment
        primary key,
    lastName varchar(255) null,
    email    varchar(255) null,
    gender   int(2)       null
)
    charset = utf8;

