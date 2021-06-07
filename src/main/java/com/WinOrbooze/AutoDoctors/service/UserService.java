package com.WinOrbooze.AutoDoctors.service;

import com.WinOrbooze.AutoDoctors.dto.UserDTO;
import com.WinOrbooze.AutoDoctors.modle.User;

import java.util.List;

public interface UserService {
    UserDTO addUser(UserDTO userDTO);
    UserDTO findByID(int id);
    List<UserDTO> FindAll();
    UserDTO updateUser(UserDTO userDTO);
    void  deleteUser(int id);

}
