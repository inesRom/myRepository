package com.jeu.spring.service;	
import java.util.List;
import com.jeu.hibernate.model.UserDetails;
public interface UserDetailsService {
    public UserDetails getuserDetails(int id);
    public List<UserDetails> getAllUserDetails();
}