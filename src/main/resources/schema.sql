CREATE TABLE Song (
	id INTEGER NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id),
	title VARCHAR(128) NOT NULL,
	artistId INTEGER NOT NULL,
	albumId INTEGER NOT NULL,
	url VARCHAR(128) NOT NULL
);
