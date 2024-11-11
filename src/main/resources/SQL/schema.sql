CREATE TABLE BOARD_INFO(
    BOARD_ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    BOARD_NAME VARCHAR(50) NOT NULL,
    CREATED_AT DATETIME NOT NULL,
    UPDATED_AT DATETIME
);

CREATE TABLE BOARD_content(
    board_content_id bigint primary key auto_increment,
    board_id bigint not null,
    title varchar(50) not null,
    board_content text not null,
    member_id bigint not null,
    status varchar(5) not null,
    created_at datetime not null,
    updated_at datetime
)