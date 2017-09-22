

package com.how2java.tmall.service;

import java.util.List;

import com.how2java.tmall.pojo.Order;

public interface OrderItemService extends BaseService {
	
	public void fill(List<Order> orders);
	public void fill(Order order);
		
	
}

	
