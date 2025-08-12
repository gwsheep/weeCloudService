package com.jproject.weeCloudService.controller;

import com.jproject.weeCloudService.entity.Users;
import com.jproject.weeCloudService.repository.UserRepository;
import com.jproject.weeCloudService.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootTest
public class UserControllerTest {

    @Autowired
    AdminService adminService;

    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    void create_and_find_user() {

        Users user1 = new Users();
        user1.setUsername("hello");
        user1.setPassword("pw11");

        Users user2 = new Users();
        user2.setUsername("hello");
        user2.setPassword("pw11");

        adminService.saveUser(user1);
        adminService.saveUser(user2);

        List<Users> userList = adminService.findUserList();
        userList.stream().forEach(u -> {
            System.out.println(u.toString());
        });
    }


}
