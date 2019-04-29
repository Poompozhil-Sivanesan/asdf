package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.beans.Merchant;


@Repository
public interface ICapStoreMerchantDAO extends JpaRepository<Merchant, Integer> {

	@Query(value = "select merchant_merchantid from merchantdetail_products where products_productid=:productId", nativeQuery=true)
	public int getMerchantId(@Param(value = "productId") int productId);
}
