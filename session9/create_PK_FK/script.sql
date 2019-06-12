create table customers (
customer_id int primary key auto_increment,
fullname varchar(255),
address varchar(255),
email varchar(100),
phone varchar(20)
);

create table accounts (
account_id int primary key auto_increment,
account_type varchar(40) default 'Normal',
day_create date,
balance double default 0,
customer_number int references customers(customer_id),
transactions_number int references transactions(transaction_id)
);

create table transactions (
transaction_id int primary key auto_increment,
date_trans date,
amounts double
	check (amounts > 0),
descriptions varchar(255)
);