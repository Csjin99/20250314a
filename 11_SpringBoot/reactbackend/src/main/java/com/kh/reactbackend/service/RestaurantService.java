package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.RestaurantDto;

import java.io.IOException;
import java.util.List;

public interface RestaurantService {

    Long createRestaurant(RestaurantDto.Create restaurantDto) throws IOException;

    List<RestaurantDto.Response> getRestaurantsByUser(String userId);

    RestaurantDto.Response getRestaurantDetail(Long restaurantNO);

    void deleteRestauran(Long restaurantNO);
}
