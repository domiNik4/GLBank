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

CREATE TABLE Accounts (idacc BIGINT UNIQUE, 
					   idc integer not null,
					   balance FLOAT(10,2) not null,
					   primary key (idacc),
					   foreign key Accounts(idc) references clients(idc)
					   on delete cascade
					   on update restrict);

INSERT INTO Accounts(idacc,idc,balance) values (1358024679,1,20000.43);
INSERT INTO Accounts(idacc,idc,balance) values (5893548221,2,12430.23);
INSERT INTO Accounts(idacc,idc,balance) values (1410821632,3,1600.90);
INSERT INTO Accounts(idacc,idc,balance) values (6401120033,4,148823.14);
INSERT INTO Accounts(idacc,idc,balance) values (4761775381,5,6.00);
INSERT INTO Accounts(idacc,idc,balance) values (7326001254,5,120.00);

CREATE TABLE banktransactions (idbt int auto_increment,
							    amount float(10,2) not null,
							    transdatetime datetime not null,
							    description varchar (140) default null,
							    idemp int not null,
							    srcacc BIGINT not null,
							    destacc BIGINT not null,
							    srcbank int not null,
							    destbank int not null,
							    primary key(idbt),
							    foreign key(idemp) references Employees(idemp)
							    );

CREATE TABLE cashtransactions (idct int auto_increment,
							    idemp int not null,
							    amount FLOAT(10,2) not null,
							    idacc BIGINT not null,
							    cashdatetime datetime not null,
							    primary key(idct),
							    foreign key(idemp) references Employees(idemp)
							    );

CREATE TABLE atmwithdrawals (idatmw integer not null auto_increment,
							  amount FLOAT(10,2)  not null,
							  datetimew datetime not null,
							  idatm integer default 0,
							  atmdatetime datetime default current_timestamp,
							  idcard integer not null,
							  primary key(idatmw),
							  foreign key(idcard) references Cards(idcard)
							  on delete cascade
					 		  on update restrict
							  );

CREATE TABLE Cards (idcard int auto_increment,
					cardnumber BIGINT unique not null,
					idacc BIGINT not null,
					blocked char(1) default 'N',
					primary key(idcard),
					foreign key (idacc) references Accounts(idacc)
					 on delete cascade
					 on update restrict
					);