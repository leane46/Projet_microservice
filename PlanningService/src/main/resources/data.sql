CREATE TABLE IF NOT EXISTS planning(
    id SERIAL PRIMARY KEY,
    siteid INT NOT NULL,
    sportid INT NOT NULL,
    dateid INT NOT NULL
);

INSERT INTO planning (id, siteid, sportid, dateid) VALUES
                                                       (1, 1, 101, 242),
                                                       (2, 2, 102, 301),
                                                       (3, 3, 103, 323),
                                                       (4, 4, 104, 345),
                                                       (5, 5, 105, 367),
                                                       (6, 6, 106, 389),
                                                       (7, 7, 107, 401),
                                                       (8, 8, 108, 423),
                                                       (9, 9, 109, 445),
                                                       (10, 10, 110, 467);
CREATE TABLE IF NOT EXISTS calendrier (
                          id SERIAL PRIMARY KEY,
                          event_date DATE NOT NULL
);

INSERT INTO calendrier (event_date)
SELECT generate_series('2024-01-01'::DATE, '2024-12-31'::DATE, '1 day'::INTERVAL) AS event_date;
