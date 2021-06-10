
   create database if not exists RepairSystem character set utf8mb4
   default collate utf8mb4_general_ci;
   
use RepairSystem;

create table if not exists Login(

   id int not null primary key auto_increment,
   usuario varchar(13) not null,
   senha varchar(18) not null

)engine = innodb, auto_increment = 1;


select * from Login;
-- truncate Login

create table if not exists Funcionario(

	cpf varchar(13) primary key not null ,
	nome varchar(45) not null,
    email varchar(45) not null,
	endereco varchar(40) not null,
	telefone varchar(14) not null,
	horasTrabalhadas int not null,
    classificacao varchar(14) not null

);

  select * from Funcionario;


create table if not exists Usuario(

  codigo_de_usuario int not null primary key auto_increment,
  usuario varchar(13) not null,
  senha varchar(20) not null,
  email varchar(40)not null,
  classficacao varchar(15)
  

)engine = innodb, auto_increment = 6000;

 insert into Usuario(codigo_de_usuario, usuario, senha, email, classficacao) values (9, "123456789", "sabrina", "sabrina@gmail", "Adm");

select * from Usuario;
-- truncate Usuario;
-- drop table Usuario;

create table if not exists Contrato(
nsquencia int not null primary key auto_increment,
cnpj varchar(18) not null,
tipoequipamento varchar (30) not null,
valorassociado int not null,
nomeempresa varchar (30) not null,
endereco varchar (30) not null,
ndequipamento int not null,
parcelaspagamento int not null
)engine = innodb, auto_increment = 00000007560;

select * from Contrato;
-- truncate Contrato;

create table if not exists Chamado(

nChamado int not null,
nomeEmpresa varchar(30) not null,
idEquipamento int not null,
motivoChamada varchar(100) not null,
dataAtendimento int not null

);

select * from Chamado;
-- truncate Chamado;