drop schema if exists beauty cascade;

create schema beauty;

create table beauty.clienti
(
    id_cliente   int primary key,
    nome         varchar(50) not null,
    cognome      varchar(50) not null,
    data_nascita date        not null,
    telefono     varchar(50) not null
);

insert into beauty.clienti
values (1, 'Mario', 'Verdi', to_date('1990-01-15', 'yyyy-mm-dd'), '1111111111'),
       (2, 'Luca', 'Rossi', to_date('1992-02-24', 'yyyy-mm-dd'), '2222222222'),
       (3, 'Rosa', 'Neri', to_date('1993-03-22', 'yyyy-mm-dd'), '3333333333');

create table beauty.servizi
(
    id_servizio int primary key,
    nome        varchar(50)    not null,
    prezzo      decimal(10, 2) not null
);

insert into beauty.servizi
values (1, 'manicure', 15.00),
       (2, 'pedicure', 20.00),
       (3, 'pulizia viso', 40.00);

create table beauty.appuntamenti
(
    id_appuntamento int primary key,
    id_cliente      int,
    id_servizio     int,
    data            date not null,
    foreign key (id_cliente) references beauty.clienti (id_cliente),
    foreign key (id_servizio) references beauty.servizi (id_servizio)
);
