DROP TABLE SUBSCRIPTION;

CREATE TABLE SUBSCRIPTION (
	subscription_id number(10),
    subscriber_name varchar(100),
    date_subscribed date,
    date_returned date default CURRENT_TIMESTAMP(),
    book_id varchar(100),
    primary key(subscription_id)
);

insert into SUBSCRIPTION (subscription_id, subscriber_name, date_subscribed, book_id)
values (1234, 'Amit Khera', '2020-08-25', 'B1001');


 