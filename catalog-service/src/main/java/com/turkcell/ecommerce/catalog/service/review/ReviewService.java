package com.turkcell.ecommerce.catalog.service.review;

import org.springframework.stereotype.Service;

import com.turkcell.ecommerce.catalog.data.entity.review.Review;
import com.turkcell.ecommerce.catalog.data.repository.review.ReviewRepository;
import com.turkcell.ecommerce.common.service.BaseService;

/**
 * @author Selahaddin Akgun
 */
@Service
public class ReviewService extends BaseService<Review> {

//	@Autowired
//	private ReviewRepository reviewRepository;
	
	@Override
	public ReviewRepository getRepository() {
		return null;
	}
}