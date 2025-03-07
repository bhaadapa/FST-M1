CREATE TABLE SALESMAN(salesman_id int, salesman_name varchar(32), salesman_city varchar(32), commission int);
DROP SALESMAN;

CREATE TABLE SALESMAN(salesman_id int, salesman_name varchar(32), salesman_city varchar(32), commission int);
describe salesman;
insert into salesman values('5003','Lauson Hen','San Jose','12');
insert into salesman values('5002','Nail Knite','Paris','13');
insert into salesman values('5005','Pit Alex','London','15');
insert into salesman values('5006','Mclyon','Paris','14');
insert into salesman values('5007','Paul Adam','Rome','13');
select * from salesman order by salesman_id;