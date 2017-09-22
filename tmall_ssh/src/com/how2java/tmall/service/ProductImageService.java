

package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Product;

public interface ProductImageService extends BaseService {
	
	public static final String type_single = "type_single";
	public static final String type_detail = "type_detail";
	
	public void setFirstProdutImage(Product product);
	
}


