create database comercio;

use comercio;

create table cliente (
	idcliente int primary key auto_increment,
	email varchar(50) unique, 
	nome varchar(30) not null, 
	sexo enum('M', 'F') not null, 
	cpf char(11) unique
);

create table endereco (
	idendereco int primary key auto_increment, 
	rua varchar(30) not null, 
	bairro varchar(30) not null, 
	cidade varchar(20) not null, 
	estado char(2) not null, 
	fk_cliente int unique,
	foreign key (fk_cliente) references 
	cliente (idcliente)
);

create table telefone (
	idtelefone int primary key auto_increment, 
	tipo enum ('RES', 'COM', 'CEL') not null, 
	numero varchar(10) not null,
	fk_cliente int, 
	foreign key (fk_cliente) references cliente(idcliente)
);