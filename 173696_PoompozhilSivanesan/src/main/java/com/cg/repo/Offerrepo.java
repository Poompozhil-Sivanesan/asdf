package com.cg.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Offer;

@Repository
public interface Offerrepo extends JpaRepository<Offer, Integer> {
	    
	//@Query("SELECT c FROM Offer c WHERE c.couponName=?1")
	//	public Offer findByOfferId(String OfferName);

}
