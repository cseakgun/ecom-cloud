package com.turkcell.ecommerce.lib.proxy;

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
public interface ReviewServiceProxy {

	static final String PREFIX = "/review-service/review";

	@PostMapping(value = { PREFIX + "/save" })
	ResponseEntity<ReviewResource> save(@RequestBody ReviewDto reviewDto);

	@GetMapping(value = { PREFIX + "/get/product-reviews/{productModelId}" })
	ResponseEntity<List<ReviewResource>> getByProductModelId(@PathVariable Long productModelId);

	@GetMapping(value = { PREFIX + "/get/status/{approvalStatus}" })
	ResponseEntity<List<ReviewResource>> getByApprovalStatus(@PathVariable String approvalStatus);

	@PutMapping(value = { PREFIX + "/update/{id}/status/{approvalStatus}" })
	ResponseEntity<List<ReviewResource>> updateApprovalStatus(@PathVariable String approvalStatus);
}