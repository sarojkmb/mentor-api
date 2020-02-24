-- All sequence
SELECT setval('seq_person', 0, true);
SELECT setval('seq_authentication', 0, true);
SELECT setval('seq_expertise', 0, true);
SELECT setval('seq_interest', 0, true);
SELECT setval('seq_my_expertise', 0, true);
SELECT setval('seq_my_interest', 0, true);
SELECT setval('seq_mm', 0, true);

--TRUNCATE all tables
TRUNCATE TABLE mentor_mentee;
TRUNCATE TABLE my_expertise;
TRUNCATE TABLE my_interest;
TRUNCATE TABLE expertise;
TRUNCATE TABLE interest;
TRUNCATE TABLE authentication;
TRUNCATE TABLE person;

-- Table: public.person
INSERT INTO person(person_id, first_name, last_name, gender, dob) VALUES (nextval('seq_person'),'saroj','behera','M','1988-06-06'); --1
INSERT INTO person(person_id, first_name, last_name, gender, dob) VALUES (nextval('seq_person'),'dibyasha','sahu','M','1994-11-24'); --2

-- TABLE authentication
INSERT INTO authentication(auth_id,person_id, username, password, access_token, valid_ts) VALUES( nextval('seq_authentication'), '1', 'sarojkmb', 'latestpassword', 'thisaccesstoken', '2020-06-22 19:10:25'); -- 1


-- TABLE expertise
INSERT INTO expertise ( expertise_id, expertise_name, expertise_area) VALUES (nextval('seq_expertise'), 'java', 'Information Technology'); -- 1
INSERT INTO expertise ( expertise_id, expertise_name, expertise_area) VALUES (nextval('seq_expertise'), 'gym', 'Health and Wellness');     -- 2
INSERT INTO expertise ( expertise_id, expertise_name, expertise_area) VALUES (nextval('seq_expertise'), 'keto diet', 'Food');              -- 3

-- TABLE interest
INSERT INTO interest ( interest_id, interest_name, interest_area) VALUES (nextval('seq_interest'), 'python', 'Information Technology'); -- 1
INSERT INTO interest ( interest_id, interest_name, interest_area) VALUES (nextval('seq_interest'), 'national parks', 'Tourism');        -- 2
INSERT INTO interest ( interest_id, interest_name, interest_area) VALUES (nextval('seq_interest'), 'meditation', 'Lifestyle');          -- 3


-- TABLE my_expertise
INSERT INTO my_expertise ( my_expertise_id, person_id, expertise_id) VALUES (nextval('seq_my_expertise'), 1, 1); -- 1
INSERT INTO my_expertise ( my_expertise_id, person_id, expertise_id) VALUES (nextval('seq_my_expertise'), 1, 3); -- 2

-- TABLE my_interest
INSERT INTO my_interest ( my_interest_id, person_id, interest_id) VALUES (nextval('seq_my_interest'), 1, 1); -- 1
INSERT INTO my_interest ( my_interest_id, person_id, interest_id) VALUES (nextval('seq_my_interest'), 1, 2); -- 2

--TABLE mentor_mentee
INSERT INTO mentor_mentee (mm_id, mentor_id, expertise_id, mentee_id, active_ind) VALUES (nextval('seq_mm'), 1, 1, 2, TRUE); -- 1

