# --- Sample dataset
 
# --- !Ups
 
delete from product;
delete from category;

insert into category (id,name) values ( 1,'Laptop' );
insert into category (id,name) values ( 2,'Tablet' );
insert into category (id,name) values ( 3,'Mobile Phone' );

 
insert into product (id,name,description,stock,price) values ( 1,'Apple Laptop','MacBook pro 13',100,192.55 );
insert into product (id,name,description,stock,price) values ( 2,'Apple Laptop','MacBook pro retina 13.3 2016 256GB',45,721.00 );
insert into product (id,name,description,stock,price) values ( 3,'Samsung Laptop','NP355-V5C LAPTOP WINDOWS 10 AMD A6 WEBCAM 6GB 500GB 15.6" HDMI 12696',580,162.81 );
insert into product (id,name,description,stock,price) values ( 4,'Samsung Laptop','RV511 LAPTOP WINDOWS 7 CORE i3 WEBCAM 3GB 320GB 15.6" HDMI 13130',312,145.00 );
insert into product (id,name,description,stock,price) values ( 5,'Apple Mobile Phone','iPHONE 6 16GB / 64GB / 128GB  Smartphone Mobile Phone',333,203.00 );
insert into product (id,name,description,stock,price) values ( 6,'Apple Mobile Phone','iPHONE 6 PLUS 16GB / 64GB Smartphone Mobile Phone',121,2799.00 );
insert into product (id,name,description,stock,price) values ( 7,'Samsung Mobile Phone','Galaxy S7 Edge G935 Black Gold Silver Blue Android Smart phone',250,232.59 );
insert into product (id,name,description,stock,price) values ( 8,'Samsung Mobile Phone','Galaxy S8 Dual sim G950FD 64GB Phone ',45,370.00 );
insert into product (id,name,description,stock,price) values ( 9,'Apple Tablet','iPAD MINI TABLET 16GB 7.9INCH HD WIFI WEBCAM BLUETOOTH BLACK',55,162.00 );
insert into product (id,name,description,stock,price) values ( 10,'Apple Tablet','iPad Pro (11-inch, WiFi, 64GB) - Space Grey (Latest Model) 2018',180,789.70 );
insert into product (id,name,description,stock,price) values ( 11,'Samsung Tablet','GALAXY TAB E SM-T560 16GB WI-Fi 9.6" TABLET BLACK',55,122.99 );
insert into product (id,name,description,stock,price) values ( 12,'Samsung Tablet','Galaxy Tab A 10.5 Tablet - Grey SM-T590 Grade A+ ',50,232.59 );
 
insert into category_product (category_id,product_id) values (1,1);
insert into category_product (category_id,product_id) values (1,2);
insert into category_product (category_id,product_id) values (1,3);
insert into category_product (category_id,product_id) values (1,4);
insert into category_product (category_id,product_id) values (3,5);
insert into category_product (category_id,product_id) values (3,6);
insert into category_product (category_id,product_id) values (3,7);
insert into category_product (category_id,product_id) values (3,8);  
insert into category_product (category_id,product_id) values (2,9);
insert into category_product (category_id,product_id) values (2,10);
insert into category_product (category_id,product_id) values (2,11);
insert into category_product (category_id,product_id) values (2,12);

 
