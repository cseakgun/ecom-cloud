package com.turkcell.ecommerce.client.dto.catalog.review;

import java.util.Map;

import com.turkcell.ecommerce.client.dto.AbstractDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Selahaddin Akgun
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ReviewDto extends AbstractDto {
	private static final long serialVersionUID = 1L;

	private Long customerId;
	private Long productModelId;
	private String maskedName;
	private String review;
	private Map<String, Double> scoreMap;

}
