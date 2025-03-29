/*Modelagem basica*/
/*Processos de modelagem*/
/*
	Modelagem Conceitual - Feito pelo AD (ADM DADOS)
	Modelagem Logica - Feito pelo AD (ADM DADOS)
	Modelagem Fisica - Feito pelo DBA OU AD
*/

create database project01;

use project01;
drop table customer;
create table customer (
	name varchar(30) not null,
    sex char(1),
    email varchar(30), 
    cpf char(11) not null, 
    phone varchar(30), 
    address varchar(100)
);

show tables;
desc customer;