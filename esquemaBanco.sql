DROP DATABASE IF EXISTS bibliotec;
CREATE DATABASE IF NOT EXISTS bibliotec;
USE bibliotec;
DROP TABLE IF EXISTS Endereco;
CREATE TABLE Endereco
		(id INT NOT NULL AUTO_INCREMENT,
		numero INT NOT NULL,
		complemento VARCHAR(45),
		cep VARCHAR(8) NOT NULL,
		logradouro INT,
		cidade varchar (200),
		PRIMARY KEY (id));

DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario
		(id INT NOT NULL AUTO_INCREMENT,
		nome VARCHAR(100) NOT NULL,
		cpf VARCHAR(11) UNIQUE NOT NULL,
		idEndereco int NOT NULL,
		telefone varchar(11) NOT NULL,
		PRIMARY KEY (id),
        FOREIGN KEY (idEndereco) REFERENCES Endereco(id) ON DELETE CASCADE);

DROP TABLE IF EXISTS Autor;
CREATE TABLE Autor
		(id INT NOT NULL AUTO_INCREMENT,
		nome VARCHAR(100) NOT NULL,
		isbn INT NOT NULL,		
		PRIMARY KEY (id));

DROP TABLE IF EXISTS Livro;
CREATE TABLE Livro
       (id INT NOT NULL AUTO_INCREMENT,
        nomeLivro VARCHAR(150) NOT NULL,
        quantidade INT NOT NULL,
        autor INT NOT NULL,
        FOREIGN KEY(autor) REFERENCES Autor(id) ON DELETE CASCADE);