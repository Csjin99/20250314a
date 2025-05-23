package com.kh.reactbackend.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED) //JPA 스펙상 필수 + 외부 생성 방지
@AllArgsConstructor
@Builder
public class Restaurant {

    @Id
    @GeneratedValue
    @Column(name= "RESTAURNAT_NO")
    private long restaurantNo;

    @Column(name="RESTAURNAT_NAME")
    private String restaurantName;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "MAIN_FOOD")
    private String mainFood;

    @Column(name = "MAIN_PRICE")
    private Integer mainPrice;

    @Column(name = "SIDE_FOOD")
    private String sideFood;

    @Column(name = "SIDE_PRICE")
    private Integer sidePrice;
}
