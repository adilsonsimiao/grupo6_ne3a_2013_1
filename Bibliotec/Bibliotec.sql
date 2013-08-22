
    create table Autor (
        id integer not null auto_increment,
        ISBN varchar(20),
        Nome varchar(200),
        primary key (id)
    ) ENGINE=InnoDB

    create table Editora (
        id integer not null auto_increment,
        email varchar(100),
        nome varchar(200),
        endereco_id integer,
        primary key (id)
    ) ENGINE=InnoDB

    create table Emprestimo (
        id integer not null auto_increment,
        dataDoEmprestimo date,
        dataPrevistaParaDevolucao date,
        livro_id integer,
        usuario_id integer,
        primary key (id)
    ) ENGINE=InnoDB

    create table Endereco (
        id integer not null auto_increment,
        bairro varchar(100),
        cep varchar(8),
        complemento varchar(20),
        logradouro varchar(200),
        numero varchar(5),
        municipio_id integer,
        primary key (id)
    ) ENGINE=InnoDB

    create table Livro (
        id integer not null auto_increment,
        nomeLivro varchar(200),
        quantidade integer not null,
        primary key (id)
    ) ENGINE=InnoDB

    create table Livro_Autor (
        livros_id integer not null,
        autores_id integer not null,
        primary key (livros_id, autores_id)
    ) ENGINE=InnoDB

    create table Municipio (
        id integer not null auto_increment,
        nome varchar(200),
        uf varchar(2),
        primary key (id)
    ) ENGINE=InnoDB

    create table Usuario (
        id integer not null auto_increment,
        cpf varchar(11),
        nome varchar(200),
        rg varchar(9),
        telefone varchar(9),
        endereco_id integer,
        primary key (id)
    ) ENGINE=InnoDB

    alter table Editora 
        add index FKF2B0A474A719334C (endereco_id), 
        add constraint FKF2B0A474A719334C 
        foreign key (endereco_id) 
        references Endereco (id)

    alter table Emprestimo 
        add index FKACDD1DCFB289AA88 (usuario_id), 
        add constraint FKACDD1DCFB289AA88 
        foreign key (usuario_id) 
        references Usuario (id)

    alter table Emprestimo 
        add index FKACDD1DCFDCA59D08 (livro_id), 
        add constraint FKACDD1DCFDCA59D08 
        foreign key (livro_id) 
        references Livro (id)

    alter table Endereco 
        add index FK6B07CBE9CB6052A8 (municipio_id), 
        add constraint FK6B07CBE9CB6052A8 
        foreign key (municipio_id) 
        references Municipio (id)

    alter table Livro_Autor 
        add index FK9590997AA410A73A (autores_id), 
        add constraint FK9590997AA410A73A 
        foreign key (autores_id) 
        references Autor (id)

    alter table Livro_Autor 
        add index FK9590997ADA9615A1 (livros_id), 
        add constraint FK9590997ADA9615A1 
        foreign key (livros_id) 
        references Livro (id)

    alter table Usuario 
        add index FK5B4D8B0EA719334C (endereco_id), 
        add constraint FK5B4D8B0EA719334C 
        foreign key (endereco_id) 
        references Endereco (id)
