CREATE TABLE steve.users (
  id bigint AUTO_INCREMENT PRIMARY KEY,
  username varchar(100) NOT NULL,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) DEFAULT NULL,
  UNIQUE (username)
);
INSERT INTO users (username, first_name, last_name) VALUES ('admin', 'Admin', 'Admin');

CREATE TABLE steve.nodes (
	id bigint AUTO_INCREMENT PRIMARY KEY,
	uuid varchar(100) NOT NULL,
	name varchar(255) NOT NULL,
	value bigint,
	deleted boolean NOT NULL DEFAULT false
);

CREATE TABLE steve.node_parents (
	node_id bigint NOT NULL,
	parent_id bigint NOT NULL,
	FOREIGN KEY (node_id) REFERENCES nodes(id) ON DELETE CASCADE,
	FOREIGN KEY (parent_id) REFERENCES nodes(id) ON DELETE CASCADE,
	UNIQUE(node_id, parent_id)
);
