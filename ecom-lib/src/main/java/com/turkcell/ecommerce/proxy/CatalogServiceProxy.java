package com.turkcell.ecommerce.proxy;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.turkcell.ecommerce.client.dto.catalog.review.ReviewDto;
import com.turkcell.ecommerce.client.resource.catalog.review.ReviewResource;

/**
 * @author Selahaddin Akgun
 */
public interface CatalogServiceProxy {

	static final String PREFIX = "/catalog-service/review";

	@PostMapping(value = { PREFIX + "/save" })
	ResponseEntity<ReviewResource> saveReview(@RequestBody ReviewDto reviewDto);

	@GetMapping(value = { PREFIX + "/get/product-reviews/{productModelId}" })
	ResponseEntity<List<ReviewResource>> getReviewByProductModelId(@PathVariable Long productModelId);

	@GetMapping(value = { PREFIX + "/get/status/{approvalStatus}" })
	ResponseEntity<List<ReviewResource>> getReviewByApprovalStatus(@PathVariable String approvalStatus);

	@PutMapping(value = { PREFIX + "/update/{id}/status/{approvalStatus}" })
	ResponseEntity<List<ReviewResource>> updateReviewApprovalStatus(@PathVariable String approvalStatus);
}