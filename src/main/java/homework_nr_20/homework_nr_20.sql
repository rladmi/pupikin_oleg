create table departaments (
departament_id INT primary key,
departament_name VARCHAR(50)
);

insert into departaments (departament_id, departament_name)
values
(1, 'IT Department'),
(2, 'Human Resources'),
(3, 'Software Engineering');

select * from departaments;

create table employees(
employee_id INT primary key,
employe_name VARCHAR(50),
departament_id INT,
foreign key (departament_id) references departaments (departament_id)
);

insert into employees (employee_id, employe_name, departament_id)
values
(1, 'Steave Jobs', 1),
(2, 'Entony Hopkins', 3),
(5, 'Tony Hawk', null),
(4, 'Jhon Petters', 2),
(3, 'Tomy Fitzgerald', 3);

select * from employees;


create table projects (
project_id INT primary key,
project_name VARCHAR(50)
);

select * from projects;

insert into projects (project_id, project_name)
values
(1, 'Viber'),
(2, 'Facebook');


create table employee_projects (
employee_id INT,
project_id INT,
foreign key (employee_id) references employees (employee_id),
foreign key (project_id) references projects (project_id)
);


insert into employee_projects (employee_id, project_id)
values
(1, 1),
(2, 1),
(3, 2),
(4, 1),
(5, 2);

select * from employee_projects;

truncate employee_projects;

update employees
set departament_id = 1
where employe_name = 'Steave Jobs';

update employees
set departament_id = 3
where employe_name = 'Entony Hopkins';

select * from employees;


select *
from employees e
left join departaments d
on e.departament_id = d.departament_id
where e.departament_id is not null;

select * from employees e
where e.departament_id is null;

select *
from employees e
inner join employee_projects ep on e.employee_id = ep.employee_id
inner join projects p on ep.project_id = p.project_id;




select * from employees e;

select *
from employees e left join departaments d
on e.departament_id = d.departament_id;

select employee_id, count (departament_id)
from employees e group by employee_id;


select departament_name, count (employee_id)
from employees e
left join departaments d on e.departament_id = d.departament_id
where e.departament_id is not null
group by departament_name;