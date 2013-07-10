DROP DATABASE IF EXISTS bibliotec;
CREATE DATABASE IF NOT EXISTS bibliotec;
USE bibliotec;
DROP TABLE IF EXISTS Endereco;

CREATE TABLE Cidade(
		id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
        nome varchar(100) NOT NULL,
        uf char(2) NOT NULL);


CREATE TABLE Endereco
		(id INT NOT NULL AUTO_INCREMENT,
		numero INT NOT NULL,
		complemento VARCHAR(45),
		cep VARCHAR(8) NOT NULL,
		logradouro VARCHAR(200) NOT NULL,
		idCidade INT NOT NULL,
		PRIMARY KEY (id),
		FOREIGN KEY (idCidade) REFERENCES Cidade(id));

DROP TABLE IF EXISTS Usuario;
CREATE TABLE Usuario
		(id INT NOT NULL AUTO_INCREMENT,
		nome VARCHAR(100) NOT NULL,
		cpf VARCHAR(11) UNIQUE NOT NULL,
		idEndereco INT NOT NULL,
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
        idAutor INT NOT NULL,
        PRIMARY KEY (id),
        FOREIGN KEY(idAutor) REFERENCES Autor(id) ON DELETE CASCADE);

