use project01;
desc customer;
# Insert informations in the tables

/*Insert without colums
	This method needs to respect the order 
    of the columns in the database
*/
insert into customer values ('JOAO', 'M', 'JOAO@GMAIL.COM', '99999999999', '222222222', 'RUA DOS PERDIDOS, 234');

/*Insert with colums
	This method is safer
*/
insert into customer(name, sex, address, phone, cpf) values 
('jorge', 'm', 'rua do paraiso, 464', '11111111', '11111111111');

select * from customer;