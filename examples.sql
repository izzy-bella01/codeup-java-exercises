-- commands being run and tested kept here

SELECT * FROM mysql.user
SELECT user, host FROM mysql.user
SELECT * FROM mysql.help_topic
SELECT help_topic_id, help_category_id, url FROM mysql.help_topic

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
