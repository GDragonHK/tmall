

package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.Review;

public interface ReviewService extends BaseService {

	void saveReviewAndUpdateOrderStatus(Review review, Order order);

	
}

