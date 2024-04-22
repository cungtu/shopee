CREATE TABLE users (username VARCHAR(100) NOT NULL primary key , password VARCHAR(100) NOT NULL , enabled boolean not null);
create table authorities (username VARCHAR(100) NOT NULL, authority VARCHAR(100) NOT NULL, constraint fk_authorities_users foreign key (username) references users(username));
create unique index ix_auth_username on authorities (username,authority);