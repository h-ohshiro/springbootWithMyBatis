create table if not exists todo (
    todo_id AUTO_INCREMENT,
    todo_title varchar(30),
    finished boolean,
    created_at timestamp,
    PRIMARY KEY(todo_id)
);