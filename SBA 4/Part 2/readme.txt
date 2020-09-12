create table dxc_users(
user_id int primary key,
user_name varchar(20),
password varchar(20),
security_question varchar(200),
security_answer varchar(100)
);



insert into dxc_users values(101,'virat','abc','favorite sport','cricket');

insert into dxc_users values(102,'rohit','xyz','what is first school','royal');

