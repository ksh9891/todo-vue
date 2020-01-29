DROP TABLE IF EXISTS todo;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR2(255) NOT NULL,
    password VARCHAR2(255) NOT NULL,
    reg_dated DATETIME DEFAULT now()
);

CREATE TABLE todo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR2(255) NOT NULL,
    user_id INT NOT NULL,
    state INT NOT NULL DEFAULT 0,
    complete_dated DATETIME NULL DEFAULT NULL,
    reg_dated DATETIME DEFAULT now(),

    FOREIGN KEY (user_id) references users(id)
);

INSERT INTO users(email, password) values ( 'ksh9891@byulsoft.com', 'aaa' );
INSERT INTO users(email, password) values ( 'ksh9892@byulsoft.com', 'bbb' );
INSERT INTO users(email, password) values ( 'ksh9893@byulsoft.com', 'ccc' );
INSERT INTO users(email, password) values ( 'ksh9894@byulsoft.com', 'ddd' );
INSERT INTO users(email, password) values ( 'ksh9895@byulsoft.com', 'eee' );
INSERT INTO users(email, password) values ( 'ksh9896@byulsoft.com', 'fff' );

INSERT INTO todo(content, user_id) values ( 'todo 작성했습니다', 1 );
INSERT INTO todo(content, user_id) values ( 'todo 작성했습니다', 1 );
INSERT INTO todo(content, user_id) values ( 'todo 작성했습니다', 1 );
INSERT INTO todo(content, user_id) values ( 'todo 작성했습니다', 1 );
INSERT INTO todo(content, user_id) values ( 'todo 작성했습니다', 1 );