package com.jproject.weeCloudService.controller;

import com.jproject.weeCloudService.entity.BaseUser;
import com.jproject.weeCloudService.service.AdminService;
import com.jproject.weeCloudService.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final AdminService adminService;
    private final UserService userService;

    @GetMapping("/list")
    public ResponseEntity<String> getUserList(@RequestParam int level) {

        List<? extends BaseUser> userList;

        return ResponseEntity.ok("test");

    }


}
