package com.kh.reactbackend.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
public class Member {

    @Id
    @Column(name = "USER_ID", length = 30)
    private String userId;

    @Column(name = "USER_PWD", length = 100, nullable = false)
    private String userPwd;

    @Column(name = "USER_NAME", length = 15, nullable = false)
    private String userName;

    @Column(length = 254)
    private String email;

    @Column(name = "GENDER", length = 1)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public enum Gender {
        M, F
    }
    private Integer age;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    List<Restaurant> restaurants = new ArrayList<>();

    public void upadteMemberInfo(String userId, String userPwd,String userName, String email, Gender gender, Integer age) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

}
