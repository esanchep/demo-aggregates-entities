# Getting Started

## MySQL docker image

<span style="color:yellow">⚠</span> **If docker service is not running automatically, try manually with `sudo dockerd`**

1. Copy the docker-compose.yml to some directory where you want to run the mysql image
2. Run the image `docker-compose up mysql`

## Preparing the database

1. Enter the mysql shell on the docker image by typing
   - `docker exec -it mysql_container mysql -uroot -ptoor`
2. Run the following scripts
   - `USE db;`
   - `CREATE USER 'user' IDENTIFIED BY 'user';`
   - `GRANT ALL PRIVILEGES ON *.* TO 'user' WITH GRANT OPTION;`
   - `FLUSH PRIVILEGES;`
   - `CREATE TABLE test (id INT NOT NULL, name VARCHAR(20), PRIMARY KEY (id));`

## Spring Boot Application

1. Run the spring boot application
2. Call the test endpoint setting an id and a name as path variables
   - IE: `http://localhost:8080/test/1/John`
3. Observe the results (the user should be created in the DB and returned as a result)
