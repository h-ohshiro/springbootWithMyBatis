drop table if exists tata;

create table if not exists tata (
    todo_id INT(11) AUTO_INCREMENT,
    todo_title varchar(30),
    finished varchar(30),
    date varchar(30),
    PRIMARY KEY(todo_id)
);