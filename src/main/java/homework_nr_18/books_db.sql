create table books(
book_id serial primary KEY,
name text,
author text,
date_of_publishing date,
available_count int
);

select *
from books;

alter table books
add column
genre text;

insert into books (name, author, date_of_publishing, available_count, genre)
values
('The Great Gatsby', 'F. Scot Fitzgerald', '1925-01-01', 3, 'Classics'),
('To Kill a Mockingbird', 'Harper Lee', '1960-01-01', 5, 'Fiction'),
('1984', 'George Orwell', '1949-01-01', 2, 'Science Fiction'),
('Pride and Prejudice', 'Jane Austen', '1813-01-01', 4, 'Romance');

select * from books;