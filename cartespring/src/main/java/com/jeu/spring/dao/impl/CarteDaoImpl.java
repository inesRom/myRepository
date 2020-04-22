package com.jeu.spring.dao.impl;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jeu.hibernate.model.Carte;
import com.jeu.spring.dao.CarteDao;
import com.jeu.spring.dao.ImageCarte;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

	
public class CarteDaoImpl implements CarteDao {
	final private Logger logger = Logger.getLogger(getClass().getName());
	

    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    @Override
    public Carte getcarte(int id) {
        Carte carte = (Carte) sessionFactory.getCurrentSession().get(Carte.class, id);
        return carte;
    }
    @SuppressWarnings("unchecked")
	@Transactional
    @Override
    public  Carte getListCarte(String valeur, String couleur) {
    	Carte carte = new Carte();
    	

		List<Carte> querylistCarte = sessionFactory.getCurrentSession().createQuery 
   			("select carte from Carte carte  where carte.valeur= :valeur and carte.couleur= :couleur" )
   			.setParameter("valeur",valeur).setParameter("couleur",couleur).list();
    	if(querylistCarte!=null && !querylistCarte.isEmpty()) {
    		carte =querylistCarte.get(0);
    	}
    	
                                
        return carte;
    }
   
    
    @SuppressWarnings("unchecked")
	@Transactional
    @Override
    public Set<Carte> getAllCarte() {

        @SuppressWarnings("unchecked")
        List<Carte> cartelist =  sessionFactory.getCurrentSession()
                .createCriteria(Carte.class).list();
      Set  carte =  new HashSet(cartelist);
      
        return carte;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
     private boolean testIfEmpty() {
    	 @SuppressWarnings("unchecked")
         List<Carte> carteList = (List<Carte>) sessionFactory.getCurrentSession()
                 .createCriteria(Carte.class).list();
    	 if(carteList!= null && !carteList.isEmpty() )
    		 return false ;
    		 else return true;

     }
   
      
	@Override
	public void saveAllCarte() throws IOException {
		 logger.debug("==Debut de getCarteList==");
		String encodedfile = null;
		if(testIfEmpty()) {
    	for(ImageCarte carteImag : ImageCarte.values() ) {
    		 Carte carte = new Carte();
    		 carte.setValeur(carteImag.getValeur().toString());
    		 carte.setCouleur(carteImag.getCouleur().toString()
    				 );
       	   
       	    
       	    File image = new File(carteImag.getPathImage().toString());
       	    InputStream fileInputStreamReader = new FileInputStream(image);
       	    byte[] bytes = new byte[(int)image.length()];
               fileInputStreamReader.read(bytes);
               encodedfile =
//               new String(Base64.encodeBase64(bytes), "UTF-8");
               new String(Base64.encode(bytes ));
               carte.setImagec(bytes);
       	    sessionFactory.getCurrentSession().save(carte);
       	    sessionFactory.getCurrentSession().flush();
       	    sessionFactory.getCurrentSession().clear();
    	}
    	 logger.debug("==Debut de getCarteList==");
    	}
	}
}