package com.example.customerapi.service;

import com.example.customerapi.dto.LoginRequestDTO;
import com.example.customerapi.dto.LoginResponseDTO;
import com.example.customerapi.dto.RegisterRequestDTO;
import com.example.customerapi.dto.UserResponseDTO;

public interface UserService {
    
    LoginResponseDTO login(LoginRequestDTO loginRequest);
    
    UserResponseDTO register(RegisterRequestDTO registerRequest);
    
    UserResponseDTO getCurrentUser(String username);
}
