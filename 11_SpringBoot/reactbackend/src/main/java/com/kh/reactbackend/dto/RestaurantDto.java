package com.kh.reactbackend.dto;

import com.kh.reactbackend.entity.Member;
import com.kh.reactbackend.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class RestaurantDto {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Create {

        private String restaurant_name;
        private String location;
        private String main_food;
        private Integer main_price;
        private String side_food;
        private Integer side_price;
        private String user_id;

        public Restaurant toEntity(Member member) {
            return Restaurant.builder()
                    .restaurantName(this.restaurant_name)
                    .location(this.location)
                    .mainFood(this.main_food)
                    .mainPrice(this.main_price)
                    .sideFood(this.side_food)
                    .sidePrice(this.side_price)
                    .member(member)
                    .build();
        }

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response {
        private Long restaurant_no;
        private String restaurant_name;
        private String location;
        private String main_food;
        private Integer main_price;
        private String side_food;
        private Integer side_price;
        private String user_id;

        public static Response toDto(Restaurant restaurant) {
            return new Response(
                    restaurant.getRestaurantNo(),
                    restaurant.getRestaurantName(),
                    restaurant.getLocation(),
                    restaurant.getMainFood(),
                    restaurant.getMainPrice(),
                    restaurant.getSideFood(),
                    restaurant.getSidePrice(),
                    restaurant.getMember().getUserId()
            );
        }
    }
}