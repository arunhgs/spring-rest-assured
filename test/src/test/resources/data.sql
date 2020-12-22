DROP TABLE IF EXISTS user;
CREATE TABLE user AS SELECT * FROM CSVREAD('classpath:users.csv');

DROP TABLE IF EXISTS passbook;
CREATE TABLE passbook AS SELECT * FROM CSVREAD('classpath:passbook.csv');