package com.simplebuy.simplebuy_back.domain.order;

public enum OrderStatusType {
    WAITING_PAYMENT,
    PAYED,
    PAYMENT_REFUSED,
    PREPARING,
    SENT,
    CANCELED,
    RETURN
}
