CREATE DATABASE apigw;
CREATE USER 'apigw'@'%' IDENTIFIED BY 'apigw123';
USE apigw;
GRANT ALL PRIVILEGES ON apigw.* TO 'apigw'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;