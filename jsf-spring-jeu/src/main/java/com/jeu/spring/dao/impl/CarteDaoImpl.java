package com.jeu.spring.dao.impl;



import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jeu.hibernate.model.Carte;
import com.jeu.hibernate.model.UserDetails;
import com.jeu.spring.dao.CarteDao;


public class CarteDaoImpl implements CarteDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    @Override
    public Carte getcarte(int id) {
        Carte carte = (Carte) sessionFactory.getCurrentSession().get(Carte.class, id);
        return carte;
    }
    @Transactional
    @Override
    public List< Carte> getAllCarte() {
        @SuppressWarnings("unchecked")
        List<Carte> carte = (List<Carte>) sessionFactory.getCurrentSession()
                .createCriteria(Carte.class).list();
        //or below query
        /*
         * @SuppressWarnings("unchecked") List<UserDetails> userDetails =
         * (List<UserDetails>)sessionFactory.getCurrentSession().createQuery(
         * "from UserDetails").list();
         */
        return carte;
    }
//    @Transactional
//    @Override
//    public List<UserDetails> getAllUserDetails() {
//        @SuppressWarnings("unchecked")
//        List<UserDetails> userDetails = (List<UserDetails>) sessionFactory.getCurrentSession()
//                .createCriteria(UserDetails.class).list();
//        //or below query
//        /*
//         * @SuppressWarnings("unchecked") List<UserDetails> userDetails =
//         * (List<UserDetails>)sessionFactory.getCurrentSession().createQuery(
//         * "from UserDetails").list();
//         */
//        return userDetails;
//    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}