-- Table: public.person

DROP TABLE IF EXISTS public.person;

CREATE TABLE public.person
(
    person_id integer NOT NULL,
    first_name character varying(255) COLLATE pg_catalog."default",
    last_name character varying(255) COLLATE pg_catalog."default",
    dob timestamp,
    gender character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT person_pkey PRIMARY KEY (person_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.person
    OWNER to abrolly_admin;


-- Table authentication

DROP TABLE IF EXISTS public.authentication;

CREATE TABLE public.authentication
(
    auth_id integer NOT NULL,
    person_id integer,
    username character varying(255) COLLATE pg_catalog."default",
    password character varying(255) COLLATE pg_catalog."default",
    access_token character varying(255) COLLATE pg_catalog."default",
    valid_ts timestamp,
    CONSTRAINT authentication_pkey PRIMARY KEY (auth_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.person
    OWNER to abrolly_admin;


-- Table expertise

DROP TABLE IF EXISTS public.expertise;

CREATE TABLE public.expertise
(
    expertise_id integer NOT NULL,
    expertise_name character varying(255) COLLATE pg_catalog."default",
    expertise_area character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT expertise_pkey PRIMARY KEY (expertise_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.person
    OWNER to abrolly_admin;


-- Table my_expertise

DROP TABLE IF EXISTS public.my_expertise;

CREATE TABLE my_expertise
(
    my_expertise_id integer NOT NULL,
    person_id integer,
    expertise_id integer,
    CONSTRAINT my_expertise_id_pkey PRIMARY KEY (my_expertise_id)
)
WITH (
     OIDS = FALSE
 )
 TABLESPACE pg_default;

 ALTER TABLE public.person
     OWNER to abrolly_admin;





-- Table interest

DROP TABLE IF EXISTS public.interest;

CREATE TABLE public.interest
(
    interest_id integer NOT NULL,
    interest_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    interest_area character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT interest_id_pkey PRIMARY KEY (interest_id)
)
 WITH (
      OIDS = FALSE
  )
  TABLESPACE pg_default;

  ALTER TABLE public.person
      OWNER to abrolly_admin;


-- Table my_interest

DROP TABLE IF EXISTS my_interest;

CREATE TABLE my_interest
(
    my_interest_id integer NOT NULL,
    person_id integer,
    interest_id integer,
    CONSTRAINT my_interest_id_pkey PRIMARY KEY (my_interest_id)
)
 WITH (
      OIDS = FALSE
  )
  TABLESPACE pg_default;

  ALTER TABLE public.person
      OWNER to abrolly_admin;


  -- Table mentor_mentee

  DROP TABLE IF EXISTS public.mentor_mentee;

  CREATE TABLE  public.mentor_mentee
  (
     mm_id integer NOT NULL,
     mentor_id integer,
     expertise_id integer,
     mentee_id integer,
     active_ind BOOLEAN ,
     CONSTRAINT mm_id_pkey PRIMARY KEY (mm_id)
  )
  WITH (
       OIDS = FALSE
   )
   TABLESPACE pg_default;

   ALTER TABLE public.person
       OWNER to abrolly_admin;




