package com.laptrinhoop.service;

import java.util.List;

import com.laptrinhoop.entity.Product;

public interface IProductService {
	List<Product> findByKeywords(String keyWords);
	Product findById(Integer id);
	List<Product> findAllProductByCategory(int id);
	List<Product> findByHot(String key);
	List<Product>  getViewProduct(String name,String id); //  get những sản phẩm da xem thông qua mảng id sp trong Cookie
	List<Product>  getFaVoProduct(String name,String id); // get những sản phẩm yêu thích thông qua mảng id sp trong Cookie

}