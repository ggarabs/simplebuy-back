ALTER TABLE product 
ADD CONSTRAINT product_seller_fk
FOREIGN KEY (seller_id)
REFERENCES users(id);

ALTER TABLE orders
ADD CONSTRAINT order_customer_fk
FOREIGN KEY (customer_id)
REFERENCES users(id);

ALTER TABLE users
ADD CONSTRAINT user_cart_fk
FOREIGN KEY (cart_id)
REFERENCES cart(id);