create database cadastro;

create table pacientes(

id int not null auto_increment primary key,
id int,
nome varchar(40),
sexo varchar(40),
dataNascimento date, 
telefone varchar(40),
rg varchar(40),
endereco varchar(40),
cep varchar(40))

