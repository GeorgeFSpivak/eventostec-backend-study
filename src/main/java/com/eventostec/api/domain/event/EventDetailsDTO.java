package com.eventostec.api.domain.event;


import java.util.Date;
import java.util.List;
import java.util.UUID;

public record EventDetailsDTO (
    UUID id,
    String title,
    String description,
    String city,
    String uf,
    Date date,
    String eventUrl,
    String imgUrl,
    List<CouponDTO> coupons) {

    public record CouponDTO (
        String code,
        Integer discount,
        Date validUntil) {
    }
}
