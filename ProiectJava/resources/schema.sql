create database Project;
use Project;
create table Products (
id int not null,
product varchar(60) not null,
title varchar(60) not null,
author varchar(60),
price double(20,10) not null,
diskFormat varchar(60),
lengthInMinutes int,
genre varchar(60),
noPages int,
noMinPlayers int,
noMaxPlayers int,
minAge int,
theme varchar(60),
device varchar(60),
primary key(id)
);
