create database library;
use library;

create table book (
	name varchar(30), 
    author varchar(30), 
    sex_author char(1), 
    quantity_pages int(5), 
    publisher varchar(30),
    value_book float(10, 2),
    state char(2), 
    year_of_publication int(4)
);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('Cavaleiro real', 'Ana Claudia',
'F', 465, 'Atlas', 49.9, 'RJ', 2009);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('SQL para leigos', 'João Nunes', 
'M', 450, 'Addison', 98, 'SP', 2018);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('Receitas Caseiras', 'Celia Tavares', 
'F', 210, 'Atlas', 45, 'RJ', 2008);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('Pessoas Efetivas', 'Eduardo Santos', 
'M', 390, 'Beta', 78, 'RJ', 2018);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('Habitos Saudáveis', 'Eduardo Santos', 
'M', 630, 'Beta', 150, 'RJ', 2019);

insert into book (name, author, sex_author, quantity_pages, publisher,
value_book, state, year_of_publication) values ('A Casa Marrom', 'Hermes Macedo', 
'M', 250, 'Bubba', 60, 'MG', 2016);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('Estacio Querido', 'Geraldo Francisco', 
'M', 310, 'Insignia', 100, 'ES', 2015);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('Pra sempre amigas', 'Leda Silva', 
'F', 510, 'Insignia', 78, 'ES', 2011);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('Copas Inesqueciveis', 'Marco Alcantara', 
'M', 200, 'Larson', 130, 'RS', 2018);

insert into book (name, author, sex_author, quantity_pages, publisher, 
value_book, state, year_of_publication) values ('O poder da mente', 'Clara Mafra', 
'F', 120, 'Continental', 56, 'SP', 2017);

#Query 1
select * from book;

#Query 2
select name, publisher from book;

#Query 3
select name, state from book where sex_author = 'M';

#Query 4
select name, quantity_pages from book where sex_author = 'F';

#Query 5
select value_book from book where state = 'SP';

#Query 6
select author, sex_author from book where 
(state = 'SP' or state = 'RJ') and sex_author = 'M';
