create table students (
student_id serial primary KEY,
name text,
surname text,
age int,
sex text
);

select * from students;

insert into students (name, surname, age, sex)
values
('Alice', 'Smith', 20, 'Female'),
('Bob', 'Johnson', 22, 'Male'),
('Charlie', 'Brown', 19, 'Male'),
('Diana', 'Lee', 21, 'Female'),
('Emily', 'Davis', 23, 'Female');

select * from students;

update students
set age = 24
where name = 'Emily';

delete from students
where name = 'Charlie';

select distinct name, age
from students
where students.sex = 'Female';

select * from students;

insert into students (name, surname, age, sex)
values
('Charlie', 'Brown', 19, 'Male');

select * from students
where name like 'C%';

select * from students;