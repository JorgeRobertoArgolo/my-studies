use exercicio;

desc funcionarios;

select departamento, count(*) from funcionarios
group by departamento order by departamento asc;

select sexo, count(*) from funcionarios
group by sexo;

/*Question 1
*21 - filmes --- roupas 53
lar 52 --- jardim 47

Masculino = 484
*/
select * from funcionarios where departamento = 'Roupas' or departamento = 'Filmes' order by departamento asc;

/*Question 2*/
select idFuncionario, nome, email, departamento from funcionarios where departamento = 'Lar'
 or departamento = 'Filmes' order by departamento;
 
 /*Question 3*/
 select idFuncionario, nome, email, departamento, sexo from funcionarios where sexo = 'Masculino' or departamento = 'Jardim';