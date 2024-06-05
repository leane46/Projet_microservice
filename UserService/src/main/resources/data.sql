CREATE TABLE IF NOT EXISTS users (
                                     id SERIAL PRIMARY KEY,
                                     name VARCHAR(100) NOT NULL,
                                     firstname VARCHAR(100) NOT NULL
);


CREATE TABLE IF NOT EXISTS user_planning (
                                             user_id INT NOT NULL,
                                             site VARCHAR(100) NOT NULL,
                                             sport VARCHAR(100) NOT NULL,
                                             date DATE NOT NULL
);


INSERT INTO users (id, name, firstname) VALUES
                                            (1, 'Smith', 'John'),
                                            (2, 'Doe', 'Jane'),
                                            (3, 'Brown', 'Charlie'),
                                            (4, 'Johnson', 'Emily'),
                                            (5, 'Williams', 'Michael'),
                                            (6, 'Jones', 'Sarah'),
                                            (7, 'Miller', 'David'),
                                            (8, 'Davis', 'Laura'),
                                            (9, 'Garcia', 'Daniel'),
                                            (10, 'Martinez', 'Emma');

-- Insert data into user_planning table
-- Insert data into user_planning table
INSERT INTO user_planning (id, user_id, site, sport, date) VALUES
                                                               (1, 1, 'Roland Garros', 'Tennis', '2024-01-01'::DATE),
                                                               (2, 2, 'Parc des Princes', 'Football', '2024-02-14'::DATE),
                                                               (3, 3, 'Stade de France', 'Rugby', '2024-03-30'::DATE),
                                                               (4, 4, 'AccorHotels Arena', 'Basketball', '2024-04-05'::DATE),
                                                               (5, 5, 'Velodrome', 'Cycling', '2024-05-10'::DATE),
                                                               (6, 6, 'Lac de Paris', 'Rowing', '2024-06-20'::DATE),
                                                               (7, 7, 'Bercy', 'Boxing', '2024-07-15'::DATE),
                                                               (8, 8, 'Champs-Élysées', 'Marathon', '2024-08-08'::DATE),
                                                               (9, 9, 'Le Golf National', 'Golf', '2024-09-25'::DATE),
                                                               (10, 10, 'Aquatic Center', 'Swimming', '2024-10-18'::DATE);
