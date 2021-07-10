create database  school;
 use school;

create table user (
id int primary key auto_increment,
name varchar(500) not null,
phone_number varchar(25) not null unique,
role int not null,
designation varchar(100) not null,
password varchar(500),
email varchar(500),
status int not null,
added_by int,
updated_by int,
created_on long,
updated_on long
); 


