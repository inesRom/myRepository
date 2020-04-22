package com.jeu.spring.dao;


import java.util.List;
import com.jeu.hibernate.model.UserDetails;
public interface UserDetailsDao {
    public UserDetails getuserDetails(int id);
    public List<UserDetails> getAllUserDetails();
}