-- a linha abaixo cria um BD 
create database dbinfo;
-- seleciona o BD
use dbinfo;
-- criar tabelas 
create table usuarios(
iduser int primary key,
usuario varchar(60) not null,
phone varchar(15),
login varchar(30) not null unique,
senhar varchar(20) not null
);
-- descrever tabela
describe usuarios;
-- inserir dados na tabela (CRUD)
-- create 
insert into usuarios(iduser,usuario,login,senhar)
values(1, 'Admin', 'admin', '12345');  
-- exibir dados 
-- read
select * from usuarios;

-- criar mais usuarios 
insert into usuarios(iduser,usuario,login,senhar)
values(2, 'teste1', 'teste1', '12345');  

insert into usuarios(iduser,usuario,login,senhar)
values(3, 'teste2', 'teste2', '12345');  

-- exibir dados 
select * from usuarios;

-- modificar dados 
-- update
update usuarios set phone='1234-5678' where iduser=1;

-- apagar um registro
-- delete 

delete from usuarios where iduser=3;

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(60) not null,
endcli varchar(100),
phonecli varchar(50) not null,
emailcli varchar(60)
);

insert into tbclientes(nomecli, endcli, phonecli, emailcli)
values('Charli XCX', 'Rua das ostras 123', '0800-5P33D-DR1V3', 'charlixxx@gmail.com');

select * from tbclientes;

-- Criar tabelas de OS 
create table tbos(
os int primary key auto_increment,
-- Abaixo a tabela puxa a hora que foi criado o registro no servidor
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
ocorrencia varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
-- abaixo o valor é separado em número de caracteres, vírgula, numero de casas já arredondado
valor decimal(10,2),
idcli int not null,
-- abaixo é feito a relação muitas OS para um cliente
foreign key(idcli) references tbclientes(idcli)
);

insert into tbos (equipamento, ocorrencia, servico, tecnico, valor, idcli)
values ('Notebook', 'Artefato na tela', 'Troca de GPU', 'Wanderlei', 1250.99, 1);

select * from tbos;

-- Trazer informações sobre duas tabelas
select
O.os,equipamento,ocorrencia,servico,valor,
C.nomecli,phonecli
from tbos as O
inner join tbclientes as C 
on (O.idcli = C.idcli);







