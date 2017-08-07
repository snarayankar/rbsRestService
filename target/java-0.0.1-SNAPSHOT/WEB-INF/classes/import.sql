--Automatically detected by hibernate and will be used to seed prototype data.  Can be deleted from a live project
insert into ITEM(id, description, price) values (1, 'Coffee', 0.75);
insert into ITEM(id, description, price) values (2, 'Tea', 0.99);
insert into ITEM(id, description, price) values (3, 'Soda', 1.50);
insert into ITEM(id, description, price) values (4, 'Water', 1.00);

insert into ORDERTABLE(id, name) values (1, 'Swann');
insert into ORDERTABLE(id, name) values (2, 'Adam');
insert into ORDERTABLE(id, name) values (3, 'Tim');

insert into ORDER_ITEM( ORDERTABLE_id, items_id) values (1, 1);
insert into ORDER_ITEM( ORDERTABLE_id, items_id) values (1, 2);
insert into ORDER_ITEM( ORDERTABLE_id, items_id) values (1, 3);
insert into ORDER_ITEM( ORDERTABLE_id, items_id) values (1, 4);