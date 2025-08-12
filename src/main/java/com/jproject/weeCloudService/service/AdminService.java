package com.jproject.weeCloudService.service;

import com.jproject.weeCloudService.entity.Users;
import com.jproject.weeCloudService.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final UserRepository userRepository;

    public void saveUser(Users users) {
        userRepository.save(users);
    }

    public List<Users> findUserList() {
        return userRepository.findAll();
    }

}
