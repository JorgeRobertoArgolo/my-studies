use comercio;

select c.nome, c.sexo, c.email, t.tipo, t.numero, e.bairro, e.cidade, e.estado
from cliente c
inner join telefone t 
on c.idcliente = t.id_cliente
inner join endereco e
on c.idcliente = e.id_cliente;

#ifnull
select c.nome, c.sexo, ifnull(c.email, 'Sem email cadastrado') as 'e-mail', t.tipo, t.numero, e.bairro, e.cidade, e.estado
from cliente c
inner join telefone t 
on c.idcliente = t.id_cliente
inner join endereco e
on c.idcliente = e.id_cliente;

#view
create view v_relatorio as
select c.nome, c.sexo, ifnull(c.email, 'Sem email cadastrado') as 'e-mail', t.tipo, t.numero, e.bairro, e.cidade, e.estado
from cliente c
inner join telefone t 
on c.idcliente = t.id_cliente
inner join endereco e
on c.idcliente = e.id_cliente;

#drop view
drop view relatorio;

#show
show tables;

select nome, numero, estado from v_relatorio;