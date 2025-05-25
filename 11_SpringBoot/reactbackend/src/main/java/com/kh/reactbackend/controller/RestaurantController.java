package com.kh.reactbackend.controller;

import com.kh.reactbackend.dto.RestaurantDto;
import com.kh.reactbackend.entity.Restaurant;
import com.kh.reactbackend.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/restaurants")
@CrossOrigin(origins = "http://localhost:5173")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping
    public ResponseEntity<Long> addRestaurant(@RequestBody RestaurantDto.Create restaurantCreate) throws IOException{

        return ResponseEntity.ok(restaurantService.createRestaurant(restaurantCreate));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<RestaurantDto.Response>> getRestaurantsByUser(@PathVariable String userId) {
        List<RestaurantDto.Response> restaurantList = restaurantService.getRestaurantsByUser(userId);
        return ResponseEntity.ok(restaurantList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantDto.Response> getBoard(@PathVariable("id") Long restaurantNO) {
        return ResponseEntity.ok(restaurantService.getRestaurantDetail(restaurantNO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRestauran(@PathVariable("id") Long restaurantNO) {
        restaurantService.deleteRestauran(restaurantNO);
        return ResponseEntity.ok().build();
    }


}
