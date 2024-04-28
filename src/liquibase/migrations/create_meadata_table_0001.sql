--liquibase formatted sql
--changeset michael:create_meadata_table_0001

--This should create a primary metadatta table

CREATE TABLE metadata (
                          id SERIAL PRIMARY KEY,
                          url VARCHAR(255),
                          data_type VARCHAR(255),
                          data_value TEXT
);
