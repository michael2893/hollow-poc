--liquibase formatted sql
--changeset michael:load_data_to_metadata_table_0002

--This should load data to the metadata table

DO $$
BEGIN
FOR i IN 1..100 LOOP
        INSERT INTO metadata (url, data_type, data_value) VALUES (
            'http://example.com/' || md5(random()::text),  -- Random URL
            CASE floor(random() * 3)::INT                        -- Random data type
                WHEN 0 THEN 'text'
                WHEN 1 THEN 'number'
                ELSE 'boolean'
            END,
            CASE floor(random() * 3)::INT                        -- Random data value
                WHEN 0 THEN 'Lorem ipsum dolor sit amet'
                WHEN 1 THEN (random() * 1000)::TEXT
                ELSE CASE floor(random() * 2)::INT
                         WHEN 0 THEN 'true'
                         ELSE 'false'
                     END
            END
        );
END LOOP;
END$$;
