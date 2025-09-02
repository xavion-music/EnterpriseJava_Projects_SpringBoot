CREATE TABLE reservation (
    id IDENTITY PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    book_title VARCHAR(255),
    genre VARCHAR(100),
    pickup_location VARCHAR(100)
);
