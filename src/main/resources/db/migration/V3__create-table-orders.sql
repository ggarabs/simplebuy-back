CREATE TABLE orders(
    id UUID PRIMARY KEY,
    customer_id UUID NOT NULL,
    status INTEGER NOT NULL
);