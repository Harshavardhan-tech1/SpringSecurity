package com.Harshavardhan.SpringSecurity.service;

import com.Harshavardhan.SpringSecurity.model.Users;
import com.Harshavardhan.SpringSecurity.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JWTToken jwtToken;

    @Autowired
    private AuthenticationManager authenticationManager;

    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public Users  register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return  userRepo.save(user);
    }

    public String verify(Users user) {
        Authentication authentication=
                authenticationManager.authenticate
                        (new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        if(authentication.isAuthenticated()){
//            return "Successfull";
            return jwtToken.generateToken(user.getUsername());
        }
        return "failed";
    }
}
