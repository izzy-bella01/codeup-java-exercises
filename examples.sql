-- commands being run and tested kept here

SELECT * FROM mysql.user
SELECT user, host FROM mysql.user
SELECT * FROM mysql.help_topic
SELECT help_topic_id, help_category_id, url FROM mysql.help_topic

-- Finding the Current User
mysql> SELECT current_user;

-- Listing Users
SELECT user, host FROM mysql.user;

-- Creating a User
CREATE USER 'billy'@'localhost' IDENTIFIED BY 'billysSecretP@ass123';

-- Privileges
GRANT ALL ON *.* TO 'billy'@'localhost'; -- grants all privileges on any and all database and table
GRANT SELECT ON *.* TO 'read_only'@'localhost'; -- can grant specific privileges to any and all database and table
GRANT SELECT, INSERT, UPDATE, DELETE ON sally_db.sallys_table TO 'sally'@'localhost'; -- grant to specific database and table
GRANT ALL ON *.* TO 'billy'@'localhost' WITH GRANT OPTION; -- grant option to allow that user to grant to others
SHOW GRANTS for 'username'@'hostname';

-- Dropping a User
DROP USER 'sally'@'localhost';

-- Creating a Database
CREATE DATABASE database_name;
CREATE DATABASE IF NOT EXISTS database_name;

-- Listing Databases
SHOW DATABASES;

--  Selecting a Database
USE database_name;

-- Showing Current Database
SELECT database();

-- Inspecting a Database
SHOW CREATE DATABASE database_name;

-- Deleting a Database
DROP DATABASE database_name;
DROP DATABASE IF EXISTS database_name;

-- CODEUP TEST USER
codeup_test_user - codeuptestuser

-- regarding: a convo about unsigned and number ranges
-- unsigned <<
-- Unsigned is going to indicate that your column will be storing NUMS . .
-- We have been used to, or are getting used to, the idea that a numeric data type really means a container that can store a RANGE of numbers..
-- For example, a normal INT column can store numbers from -2,147,483,648 to 2,147,483,647
-- By adding the word UNSIGNED to the column - we still have the same RANGE we can store . . but we’re saying “hey, MYSQL, this is going to ONLY store positive numbers”
-- Real world example: IDS, Grades, whatever would need to be positive, tracks on an album!, inventory !
-- Not only is it forced to be positive - but our RANGE adjusts as well
-- 0 > 4,294,967,295
-- Our capacity stays the same - now though, it’s ALL POSITIVE NUMBERS

-- Creating Tables
CREATE TABLE table_name (
    column1_name data_type,
    column2_name data_type,
    ...
);

CREATE TABLE quotes (
    author_first_name VARCHAR(50),
    author_last_name  VARCHAR(100) NOT NULL,
    content TEXT NOT NULL
);

-- Primary Keys
CREATE TABLE quotes (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    author_first_name VARCHAR(50),
    author_last_name  VARCHAR(100) NOT NULL,
    content TEXT NOT NULL,
    PRIMARY KEY (id)
);

-- Default Values
CREATE TABLE quotes (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    author_first_name VARCHAR(50) DEFAULT 'NONE',
    author_last_name  VARCHAR(100) NOT NULL,
    content TEXT NOT NULL,
    PRIMARY KEY (id)
);

-- Showing Tables
SHOW TABLES;
+--------------------------+
| Tables_in_codeup_test_db |
+--------------------------+
| quotes                   |
+--------------------------+
1 row in set (0.00 sec)

-- Describing Tables
+-------------------+------------------+------+-----+---------+----------------+
| Field             | Type             | Null | Key | Default | Extra          |
+-------------------+------------------+------+-----+---------+----------------+
| id                | int(10) unsigned | NO   | PRI | NULL    | auto_increment |
| author_first_name | varchar(50)      | YES  |     | NULL    |                |
| author_last_name  | varchar(100)     | NO   |     | NULL    |                |
| content           | text             | NO   |     | NULL    |                |
+-------------------+------------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

SHOW CREATE TABLE quotes\G;

-- Dropping Tables
DROP TABLE quotes;
DROP TABLE IF EXISTS quotes;

-- The inverse
CREATE TABLE IF NOT EXISTS quotes (
    ...
);

-- SQL Scripts
mysql -u USERNAME -p -t < filename.sql