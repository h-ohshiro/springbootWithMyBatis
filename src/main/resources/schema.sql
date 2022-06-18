create table if not exists tata (
    todo_id INT(11) AUTO_INCREMENT,
    todo_title varchar(30),
    finished boolean,
    created_at timestamp,
    PRIMARY KEY(todo_id)
);