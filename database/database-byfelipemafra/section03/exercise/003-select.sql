use project01;

select now() as data_hora;

select * from customer;

select name as customer, sex, email, now() as data_hora from customer;
select name as customer, sex, email, address from customer;

select name as customer from customer where sex = 'm';
select name as customer from customer where address like '%paraiso%';