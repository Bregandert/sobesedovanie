drop table if exists students cascade;
create table students (id bigserial, name varchar(255), age int, primary key(id));

insert into students
(name, age) values
('Student 1', 18),
('Student 2', 19),
('Student 3', 20);
