create database boxd;
use boxd;
create table usuario(
	id_usuario int not null auto_increment,
    email varchar(100) not null,
    nome_usuario varchar(50) not null,
    senha varchar(50) not null,
    constraint usuario_pk
		primary key (id_usuario)
);

create table morador(
		id_morador int not null auto_increment,
        cpf varchar(15) not null,
        nome_morador varchar(50) not null,
        idade int not null,
        numero_bloco int null,
        numero_ap int null,
        nome_condominio varchar(100) not null,
        constraint id_morador_pk
			primary key (id_morador),
		index idx_cpf (cpf),-- Adiciona índice ao cpf do morador
		constraint bloco_morador_fk
			foreign key (numero_bloco) references moradia(numero_bloco),
		constraint ap_morador_fk
            foreign key (numero_ap) references moradia(numero_ap),
		constraint condominio_morador_fk
            foreign key (nome_condominio) references moradia(nome_condominio)
);

create table moradia(
	id_moradia int not null auto_increment,
	nome_condominio varchar(100) not null,
	numero_bloco int not null,
    numero_ap int not null,
    
    constraint moradia_pk
		primary key (id_moradia),
	index idx_numero_bloco (numero_bloco), -- Adiciona índice a numero_bloco
    index idx_numero_ap (numero_ap), -- Adiciona índice a numero_ap
    index idx_nome_condominio (nome_condominio) -- Adiciona índice ao nome_condominio
);

create table pedido(
	id_pedido int not null auto_increment,
    remetente varchar(100) not null,
    numero_bloco int not null,
    numero_ap int not null,
    nome_condominio varchar(100) not null,
    id_morador int not null,
    cpf varchar(15),
    
    constraint pedido_pk
		primary key (id_pedido),
        
	constraint bloco_pedido_fk
		foreign key (numero_bloco) references moradia(numero_bloco),
	constraint ap_pedido_fk
        foreign key (numero_ap) references moradia(numero_ap),
	constraint condominio_pedido_fk
        foreign key (nome_condominio) references moradia(nome_condominio),
	constraint id_morador_pedido_fk
        foreign key (id_morador) references morador(id_morador),
	constraint cpf_morador_pedido_fk
        foreign key (cpf) references morador(cpf)    
);

