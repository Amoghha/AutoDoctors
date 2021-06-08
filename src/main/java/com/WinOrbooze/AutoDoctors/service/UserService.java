package com.WinOrbooze.AutoDoctors.service;

import com.WinOrbooze.AutoDoctors.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO addUser(UserDTO userDTO);    //Create
    UserDTO findByID(int id);
    List<UserDTO> FindAll();  //Retrieve
    UserDTO updateUser(UserDTO userDTO);  //Update
    void  deleteUser(int id);   //Delete

}
