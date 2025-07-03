CREATE TABLE users(
    id UUID PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    cart_id UUID UNIQUE NOT NULL,
    created_at DATE NOT NULL
);