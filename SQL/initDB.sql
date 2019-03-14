create database if not exists mybatis;
use mybatis;

drop table if exists users;
create table if not exists users(
  id int primary key auto_increment,
  name varchar(30),
  password varchar(50),
  email varchar(20),
  phone_number int,
  create_time datetime
    default current_timestamp,
  update_time datetime
    default current_timestamp
);

insert into users
  (name,password,email)
values
  ('jack', 'wrwerwerwe', 'qweasd@gmail.com');

select * from users;

select * from users
  where (
    true and
  name = 'Alice' and
  password = '23333');

# 1999 < 2019
select * from users
where (
  create_time < current_timestamp
        );

update users
  set
    name = 'Jack'
  where (name = 'jack');