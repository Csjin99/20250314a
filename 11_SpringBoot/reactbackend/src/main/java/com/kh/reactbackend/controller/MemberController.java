package com.kh.reactbackend.controller;


import com.kh.reactbackend.dto.MemberDto;
import com.kh.reactbackend.service.MemberService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<String> addMember(@RequestBody MemberDto.Create createDto) {
        String userId = memberService.createMember(createDto);
        return ResponseEntity.ok(userId);
    }

    @GetMapping
    public ResponseEntity<Boolean> checkUserIdDuplicate(@RequestParam String userId) {
        boolean exists = memberService.existsByUserId(userId);
        return ResponseEntity.ok(exists);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Optional<MemberDto.Response> loginResult = memberService.login(loginRequest.getUserId(), loginRequest.getUserPwd());
        if (loginResult.isPresent()) {
            return ResponseEntity.ok(loginResult.get());
        } else {
            return ResponseEntity.status(401).body("아이디 또는 비밀번호가 틀렸습니다.");
        }
    }

    @Data
    static class LoginRequest {
        private String userId;
        private String userPwd;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<MemberDto.Response> getMember(@PathVariable String userId) {
        return ResponseEntity.ok(memberService.findMember(userId));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<MemberDto.Response> updateMember(
            @PathVariable String userId,
            @RequestBody MemberDto.Update updateDto) {
        return ResponseEntity.ok(memberService.updateMember(userId, updateDto));
    }

}
