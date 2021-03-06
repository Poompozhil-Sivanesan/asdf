package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Product;


@Repository
public interface ICapStoreProductDAO extends JpaRepository<Product, Integer> {

	public List<Product> findByProductBrand(String productBrand);
	public List<Product> findByProductCategory(String productCategory);
	public List<Product> findByProductName(String productName);
}
