

package com.how2java.tmall.service;

import java.util.List;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Product;

public interface ProductService extends BaseService {
	public void fill(List<Category> categorys);
	public void fill(Category category);
	public void fillByRow(List<Category> categorys);
	public void setSaleAndReviewNumber(Product product);
	public void setSaleAndReviewNumber(List<Product> products);
	public List<Product> search(String keyword, int start, int count);	
}

