DROP DATABASE IF EXISTS adlister_db;

CREATE DATABASE adlister_db;

USE adlister_db;

CREATE TABLE users (
      id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
      username VARCHAR(50) NOT NULL,
      email VARCHAR(75) NOT NULL,
      password VARCHAR(25) NOT NULL
);

CREATE TABLE ads (
      id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
      user_id INT UNSIGNED,
      title VARCHAR(75) NOT NULL,
      description TEXT NOT NULL,
      FOREIGN KEY (user_id) REFERENCES users(id)
);