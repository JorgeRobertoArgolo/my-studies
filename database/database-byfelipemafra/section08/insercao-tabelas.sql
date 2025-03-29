use comercio;

desc cliente;

insert into cliente(idcliente, nome, sexo, email, cpf)
values (null, 'JOAO', 'M','JOAO@IG.COM', '12345678912');

insert into cliente(idcliente, nome, sexo, email, cpf)
values (null, 'CARLOS', 'M','CARLOS@IG.COM', '32165498765');

insert into cliente (idcliente, nome, sexo, email, cpf)
values (null, 'ANA', 'F','ANA@IG.COM', '98745612365');

insert into cliente (idcliente, nome, sexo, email, cpf)
values (null, 'CLARA', 'F', null, '00000000000');

insert into cliente (idcliente, nome, sexo, email, cpf)
values (null, 'JORGE', 'M','JORGE@IG.COM', '00000000120');

insert into cliente (idcliente, nome, sexo, email, cpf)
values (null, 'CELIA', 'F','CELIA@IG.COM', '1234000000');


insert into endereco values (null, 'rua antonio sa', 'centro', 
'b.horizonte', 'mg', 4);

insert into endereco values (null, 'rua fulano sa', 'centro', 
'rio de janeiro', 'rj', 1);

insert into endereco values (null, 'rua ciclano sa', 'jardins', 
'b.horizonte', 'sp', 3);

insert into endereco values (null, 'rua eduardo sa', 'rio de janeiro', 
'vitoria', 'rj', 2);

insert into endereco values (null, 'rua felix sa', 'centro', 
'salvador', 'ba', 5);

insert into endereco values (null, 'rua tras sa', 'centro', 
'feira de santana', 'ba', 6);

select * from endereco;

INSERT INTO TELEFONE VALUES(NULL,'CEL','78458743',5);
INSERT INTO TELEFONE VALUES(NULL,'RES','56576876',5);
INSERT INTO TELEFONE VALUES(NULL,'CEL','87866896',1);
INSERT INTO TELEFONE VALUES(NULL,'COM','54768899',2);
INSERT INTO TELEFONE VALUES(NULL,'RES','99667587',1);
INSERT INTO TELEFONE VALUES(NULL,'CEL','78989765',3);
INSERT INTO TELEFONE VALUES(NULL,'CEL','99766676',3);
INSERT INTO TELEFONE VALUES(NULL,'COM','66687899',1);
INSERT INTO TELEFONE VALUES(NULL,'RES','89986668',5);
INSERT INTO TELEFONE VALUES(NULL,'CEL','88687909',2);