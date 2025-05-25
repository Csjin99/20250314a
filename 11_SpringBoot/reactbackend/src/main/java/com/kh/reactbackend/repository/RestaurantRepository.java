package com.kh.reactbackend.repository;

import com.kh.reactbackend.entity.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository {

    Long save(Restaurant restaurant);

    List<Restaurant> findByUserId(String userId);

    Optional<Restaurant> findById(Long id);

    void delete(Restaurant restaurant);
}
