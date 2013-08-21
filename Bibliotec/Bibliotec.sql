
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
        cep varchar(9),
        complemento varchar(20),
        logradouro varchar(200),
        numero varchar(5),
        municipio_id integer,
        primary key (id)
    ) ENGINE=InnoDB

    create table Genero (
        id integer not null auto_increment,
        Genero varchar(200),
        primary key (id)
    ) ENGINE=InnoDB

    create table Livro (
        id integer not null auto_increment,
        Isbn varchar(13),
        nomeLivro varchar(200),
        quantidade integer not null,
        editora_id integer,
        genero_id integer,
        primary key (id)
    ) ENGINE=InnoDB

    create table Livro_Autor (
        livros_id integer not null,
        autores_id integer not null,
        primary key (livros_id, autores_id)
    ) ENGINE=InnoDB

    create table Livro_Editora (
        livros_id integer not null,
        editoras_id integer not null
    ) ENGINE=InnoDB

    create table Municipio (
        id integer not null auto_increment,
        nome varchar(200),
        uf varchar(2),
        primary key (id)
    ) ENGINE=InnoDB

    create table Usuario (
        id integer not null auto_increment,
        DDD varchar(2),
        cpf varchar(12),
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

    alter table Livro 
        add index FK4607E765F3568C8 (editora_id), 
        add constraint FK4607E765F3568C8 
        foreign key (editora_id) 
        references Editora (id)

    alter table Livro 
        add index FK4607E766D3F472C (genero_id), 
        add constraint FK4607E766D3F472C 
        foreign key (genero_id) 
        references Genero (id)

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

    alter table Livro_Editora 
        add index FK29CDF3ABDA9615A1 (livros_id), 
        add constraint FK29CDF3ABDA9615A1 
        foreign key (livros_id) 
        references Livro (id)

    alter table Livro_Editora 
        add index FK29CDF3AB80E1971D (editoras_id), 
        add constraint FK29CDF3AB80E1971D 
        foreign key (editoras_id) 
        references Editora (id)

    alter table Usuario 
        add index FK5B4D8B0EA719334C (endereco_id), 
        add constraint FK5B4D8B0EA719334C 
        foreign key (endereco_id) 
        references Endereco (id)
