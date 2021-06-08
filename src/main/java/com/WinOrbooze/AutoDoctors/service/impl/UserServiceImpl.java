package com.WinOrbooze.AutoDoctors.service.impl;

import com.WinOrbooze.AutoDoctors.dto.UserDTO;
import com.WinOrbooze.AutoDoctors.modle.User;
import com.WinOrbooze.AutoDoctors.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import repository.UserRepository;

import java.util.List;
@Service
@RestController
@Repository
@Component
//@Configuration
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user=new User(userDTO);
        User savedUser = userRepository.save(user);
        UserDTO savedUserDTO = new UserDTO(savedUser);

        return savedUserDTO;
    }

    @Override
    public UserDTO findByID(int id) {
        return null;
    }

    @Override
    public List<UserDTO> FindAll() {
        return null;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
