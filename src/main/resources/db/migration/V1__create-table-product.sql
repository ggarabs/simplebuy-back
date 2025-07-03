CREATE TABLE product(
    id UUID PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price INTEGER NOT NULL,
    description VARCHAR(1000) NOT NULL,
    stock_quantity BIGINT NOT NULL,
    seller_id UUID NOT NULL,
    created_at DATE NOT NULL
);