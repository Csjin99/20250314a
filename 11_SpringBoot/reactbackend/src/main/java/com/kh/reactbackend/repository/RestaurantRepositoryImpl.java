package com.kh.reactbackend.repository;

import com.kh.reactbackend.entity.Restaurant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Long save(Restaurant restaurant) {
        em.persist(restaurant);
        return restaurant.getRestaurantNo();
    }

    public List<Restaurant> findByUserId(String userId) {
        return em.createQuery("select r from Restaurant r where r.member.userId = :userId", Restaurant.class)
                .setParameter("userId", userId)
                .getResultList();
    }

    @Override
    public Optional<Restaurant> findById(Long id) {
        Restaurant restaurant = em.find(Restaurant.class, id);
        return Optional.ofNullable(restaurant);
    }

    @Override
    public void delete(Restaurant restaurant) {
        em.remove(restaurant);
    }
}
