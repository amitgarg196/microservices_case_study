DROP TABLE BOOK;

CREATE TABLE BOOK (
    book_id varchar(100) primary key,
    book_name varchar(100),
    author varchar(100),
    available_copies numeric(5),
   total_copies numeric(5)
);


insert into book (book_id, book_name, author, available_copies, total_copies)
values ('B1001', 'Let us C', 'Yashavant Kanetkar', 100, 100);

insert into book (book_id, book_name, author, available_copies, total_copies)
values ('B1002', 'Java - The Complete Reference', 'Herbert Schildt', 80, 80);

insert into book (book_id, book_name, author, available_copies, total_copies)
values ('B1003', 'Introduction to Algorithms', 'Thomas H. Cormen', 90, 90);
 