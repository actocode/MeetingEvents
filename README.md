To run the H2 console. Please open the below URL -

http://localhost:8080/h2-console/login.jsp?jsessionid=6677b572683c5d0b785a39f1d13d95be

username - sa
password - password
datasource.url=jdbc:h2:mem:testdb

Run the below queries on h2 console -

insert into person (id, name, created_on, updated_on)  values(1, 'akanksha', now(), now());
insert into calender(id, created_on, person_id, updated_on, description) values(1, now(), 1, now(), 'interview test');

insert into person (id, name, created_on, updated_on)  values(2, 'akanksha1', now(), now());
insert into calender(id, created_on, person_id, updated_on, description) values(2, now(), 2, now(), 'interview test');

select * from person;
select * from calender;

select * from event;
select * from event_calender_list;


Run below curl request on postman to insert and fetch the events -

Add an event -

curl --location 'http://localhost:8080/addAnEvent' \
--header 'Content-Type: application/json' \
--data '{
    "id": 1,
    "title": "interview test",
    "startTime": "2024-05-12T15:47:32.008Z",
    "endTime": "2024-05-12T15:47:32.008Z",
    "calenderList" : [{ "id": 1}, {"id": 2}]

}'

Fetch an event -

curl --location 'http://localhost:8080/showAnEvent/1'






