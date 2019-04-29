package com.cg.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Offer;

@Repository
public interface ICapStoreOfferDAO extends JpaRepository<Offer, Integer> {

}

