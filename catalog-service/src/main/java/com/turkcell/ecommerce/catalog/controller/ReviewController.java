package com.turkcell.ecommerce.catalog.controller;

import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.ecommerce.catalog.data.entity.review.Review;
import com.turkcell.ecommerce.catalog.mapper.ReviewMapper;
import com.turkcell.ecommerce.catalog.service.review.ReviewService;
import com.turkcell.ecommerce.client.dto.catalog.review.ReviewDto;
import com.turkcell.ecommerce.client.resource.catalog.review.ReviewResource;
import com.turkcell.ecommerce.common.controller.BaseEntityController;

/**
 * @author Selahaddin Akgun
 */
@RestController
@RequestMapping("/review")
public class ReviewController extends BaseEntityController<ReviewDto, Review, ReviewResource, ReviewService> {

	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private ReviewMapper reviewMapper;

	@GetMapping("/test")
	public ReviewResource test() {
		Review res = new Review();
		res.setCreatedBy("Selahaddin A.");
		res.setCreatedDate(ZonedDateTime.now());
		res.setIdentifier(1L);
		res.setLastModifiedBy("Selahaddin A.");
		res.setLastModifiedDate(ZonedDateTime.now());
		return reviewMapper.toResource(res);
	}

	@Override
	protected ReviewService getService() {
		return reviewService;
	}

	@Override
	protected ReviewMapper getMapper() {
		return reviewMapper;
	}


}
