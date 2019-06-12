CREATE TABLE contacts
(
contact_id INT(11) NOT NULL AUTO_INCREMENT,
last_name VARCHAR(30) NOT NULL,
first_name VARCHAR(25),
birthday DATE,
CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

create table suppliers
(
supplier_id int(11) not null auto_increment,
supplier_name varchar(50) not null,
account_rep varchar(30) not null default 'TBD',
constraint supplier_pk primary key (supplier_id)
);

alter table contacts
add email varchar(40) not null after first_name;

alter table suppliers
change column account_rep acc_rep varchar(30) not null default 'TBD';