package com.mflyyou.springboot.user;

import com.mflyyou.springboot.user.api.UserApi;
import com.mflyyou.springboot.user.api.request.CreateUserRequest;
import com.mflyyou.springboot.user.api.response.ConfigResponse;
import com.mflyyou.springboot.user.api.response.CreateUserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController implements UserApi {
    private final ZpqConfigrutation configrutation;

    @Override
    @PostMapping("")
    public CreateUserResponse create(@RequestBody CreateUserRequest request) {
        log.info("Create user request: {}", request);
        return CreateUserResponse.builder()
                .id(10086L)
                .build();
    }

    @GetMapping("/config")
    public ConfigResponse getConfig() {
        System.out.println("11");
        return ConfigResponse.builder()
                .name(configrutation.getName())
                .age(configrutation.getAge())
                .build();
    }
}
