package com.turkcell.ecommerce.lib.dto.review;

import java.util.Map;

import com.turkcell.ecommerce.common.resource.dto.AbstractDto;

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
