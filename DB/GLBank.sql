CREATE DATABASE GLBank;

USE GLBank;

CREATE TABLE Employees(idemp integer auto_increment, 
					firstname varchar(20) not null, 
					lastname varchar(20) not null, email varchar(30) unique,
					position char(1) not null default 'C', primary key(idemp));

INSERT INTO Employees(firstname, lastname, email, position) values ("Employee","One", "employee.one@glbank.com",'c');
INSERT INTO Employees(firstname, lastname, email, position) values ("Employee","Two", "employee.two@glbank.com",'c');
INSERT INTO Employees(firstname, lastname, email, position) values ("Employee","Three", "employee.three@glbank.com",'c');
INSERT INTO Employees(firstname, lastname, email, position) values ("Employee","Four", "employee.four@glbank.com",'c');

CREATE TABLE  LoginEmployee(id integer auto_increment,
							idemp integer not null, 
							login varchar(15) not null, 
							password varchar(60) not null, primary key(id),
							foreign key(idemp) references Employees(idemp)
							on delete cascade
							on update restrict);

INSERT INTO LoginEmployee(idemp,login,password) values (1,"FirstUser", "secret");
INSERT INTO LoginEmployee(idemp,login,password) values (2,"SecondUser", "secret");
INSERT INTO LoginEmployee(idemp,login,password) values (3,"ThirdUser", "secret");
INSERT INTO LoginEmployee(idemp,login,password) values (4,"FourthUser", "secret");

CREATE TABLE HistoryLoginEmployee( id integer auto_increment, 
									idemp integer not null,
									logindate datetime not null,
									primary key(id),
									foreign key (idemp) references Employees(idemp)
									on delete cascade
									on update restrict);

Create table Clients (idc integer auto_increment, firstname varchar(20) not null, 
						lastname varchar(20) not null,
						dob date not null,
						email varchar(30),
						disable char(1) default 'F', 
						primary key (idc));

INSERT INTO Clients (firstname,lastname,dob,email) values("Client","One",'1985-03-23',"client.one@gmail.com");
INSERT INTO Clients (firstname,lastname,dob,email) values("Client","Two",'1973-05-15',"client.two@gmail.com");
INSERT INTO Clients (firstname,lastname,dob,email) values("Client","Three",'1999-11-25',"client.three@gmail.com");
INSERT INTO Clients (firstname,lastname,dob,email) values("Client","Four",'1999-07-31', "client.four@gmail.com");
INSERT INTO Clients (firstname,lastname,dob,email) values("Client","Five",'1995-02-02', "client.five@gmail.com");


Create table ClientDetails (idcd integer auto_increment,
							idc integer not null, 
							street varchar(30) not null, 
							housenumber integer not null, 
							city varchar(30) not null,
							postcode char(5) not null, 
							primary key (idcd), 
							foreign key ClientDetails(idc) references clients(idc) 
							on delete cascade on update restrict);

INSERT INTO ClientDetails (idc,street,housenumber,city,postcode) values(1,"Long Street",24,"Orgrimmar","00423");
INSERT INTO ClientDetails (idc,street,housenumber,city,postcode) values(2,"Stupid Street",26,"Undercity","12023");
INSERT INTO ClientDetails (idc,street,housenumber,city,postcode) values(3,"Orange",247,"Silvermoon City","12023");
INSERT INTO ClientDetails (idc,street,housenumber,city,postcode) values(4,"Yellow Street",258,"Undercity","02027");
INSERT INTO ClientDetails (idc,street,housenumber,city,postcode) values(5,"Green Street",6,"Sen'jin Village","50043");



create table LoginClient(idlc integer auto_increment, 
						idc integer not null, 
						login varchar(20), 
						password varchar(20),
						blocked char(1) default 'F',
						primary key(idlc),
						foreign key(idc) references clients(idc) 
						on delete cascade 
						on update restrict);

INSERT INTO LoginClient(idc,login,password) values (1,"FirstClient", "secret");
INSERT INTO LoginClient(idc,login,password) values (2,"SecondClient", "secret");
INSERT INTO LoginClient(idc,login,password) values (3,"ThirdClient", "secret");
INSERT INTO LoginClient(idc,login,password) values (4,"FourthClient", "secret");
INSERT INTO LoginClient(idc,login,password) values (5,"FifthClient", "secret");