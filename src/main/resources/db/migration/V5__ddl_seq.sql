-- SEQUENCE: public.seq_authentication

DROP SEQUENCE IF EXISTS public.seq_authentication;

CREATE SEQUENCE public.seq_authentication
    INCREMENT 1
    START 0
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.seq_authentication
    OWNER TO abrolly_admin;

-- SEQUENCE: public.seq_expertise

DROP SEQUENCE IF EXISTS public.seq_expertise;

CREATE SEQUENCE public.seq_expertise
    INCREMENT 1
    START 0
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.seq_expertise
    OWNER TO abrolly_admin;

-- SEQUENCE: public.seq_interest

DROP SEQUENCE IF EXISTS public.seq_interest;

CREATE SEQUENCE public.seq_interest
    INCREMENT 1
    START 0
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.seq_interest
    OWNER TO abrolly_admin;


-- SEQUENCE: public.seq_mm

DROP SEQUENCE IF EXISTS public.seq_mm;

CREATE SEQUENCE public.seq_mm
    INCREMENT 1
    START 0
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.seq_mm
    OWNER TO abrolly_admin;


-- SEQUENCE: public.seq_my_expertise

DROP SEQUENCE IF EXISTS public.seq_my_expertise;

CREATE SEQUENCE public.seq_my_expertise
    INCREMENT 1
    START 0
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.seq_my_expertise
    OWNER TO abrolly_admin;


-- SEQUENCE: public.seq_my_interest

DROP SEQUENCE IF EXISTS public.seq_my_interest;

CREATE SEQUENCE public.seq_my_interest
    INCREMENT 1
    START 0
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.seq_my_interest
    OWNER TO abrolly_admin;

-- SEQUENCE: public.seq_person

DROP SEQUENCE IF EXISTS public.seq_person;

CREATE SEQUENCE public.seq_person
    INCREMENT 1
    START 7
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.seq_person
    OWNER TO abrolly_admin;