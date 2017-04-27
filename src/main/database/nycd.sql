CREATE TABLE nyc_records
(
  id bigserial NOT NULL,
  name character varying,
  address character varying,
  tel character varying,
  url character varying,
  CONSTRAINT pk PRIMARY KEY (id)
);
