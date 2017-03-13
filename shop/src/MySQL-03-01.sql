
drop database if exists example;

create database example default character set utf8;
use example ;

drop table if exists category;

CREATE table category
(
  id int not null auto_increment,
  typed    varchar(20) ,
  hot  bool default false,
  
  primary key (id)
 
 );


