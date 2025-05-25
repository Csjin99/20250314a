package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.RestaurantDto;
import com.kh.reactbackend.entity.Member;
import com.kh.reactbackend.entity.Restaurant;
import com.kh.reactbackend.repository.MemberRepository;
import com.kh.reactbackend.repository.RestaurantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public Long createRestaurant(RestaurantDto.Create createRestaurant){

        Member member = memberRepository.findOne(createRestaurant.getUser_id())
                .orElseThrow(() -> new EntityNotFoundException("회원을 찾을 수 없습니다."));

        Restaurant restaurant = createRestaurant.toEntity(member);

        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<RestaurantDto.Response> getRestaurantsByUser(String userId) {
        // 1. userId로 맛집 리스트 조회 (예: memberId가 userId인 맛집 리스트)
        List<Restaurant> restaurants = restaurantRepository.findByUserId(userId);

        // 2. Entity -> DTO 변환 후 리스트로 반환
        return restaurants.stream()
                .map(RestaurantDto.Response::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public RestaurantDto.Response getRestaurantDetail(Long restaurantNO) {
        Restaurant restaurant = restaurantRepository.findById(restaurantNO)
                .orElseThrow(() -> new EntityNotFoundException("식당을 찾을 수 없습니다."));
        return RestaurantDto.Response.toDto(restaurant);
    }

    @Transactional
    @Override
    public void deleteRestauran(Long restaurantNO) {
        Restaurant restaurant = restaurantRepository.findById(restaurantNO)
                .orElseThrow(() -> new EntityNotFoundException("식당을 찾을 수 없습니다."));

        restaurantRepository.delete(restaurant);

    }
}
