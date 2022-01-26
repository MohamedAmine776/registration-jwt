package com.m7a95.registration.user;


import com.m7a95.registration.auth.jwt.JWTConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;
    private final JWTConfig jwtConfig;

    @GetMapping("/all")
    public List<User> getUsers() {
        return userRepository.findAll();
    }


}