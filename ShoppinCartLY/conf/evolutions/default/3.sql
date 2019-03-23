# --- !Ups
delete from user;

insert into user (type,email,role,name,password) values ('a', 'admin@products.com','admin', 'Alice Admin', 'password'  );

insert into user (type,email,role,name,password) values ( 'm','manager@products.com','manager', 'Bob Manager', 'password' );

insert into user (type,email,role,name,password) values ('customer' ,'customer@products.com', 'customer','Charlie Customer', 'password' );