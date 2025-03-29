select c.nome, c.sexo, e.bairro, e.cidade, t.tipo, t.numero 
from cliente c
inner join endereco e 
on c.idcliente = e.fk_cliente
inner join telefone t
on c.idcliente = t.fk_cliente;