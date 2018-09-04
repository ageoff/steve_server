CREATE TABLE steve.users (
  id integer AUTO_INCREMENT PRIMARY KEY,
  username varchar(100) NOT NULL,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) DEFAULT NULL,
  UNIQUE (username)
);
INSERT INTO users (username, first_name, last_name) VALUES ('admin', 'Admin', 'Admin');
