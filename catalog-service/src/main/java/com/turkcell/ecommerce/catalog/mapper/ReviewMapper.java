package com.turkcell.ecommerce.catalog.mapper;

import org.mapstruct.Mapper;

import com.turkcell.ecommerce.catalog.data.entity.review.Review;
import com.turkcell.ecommerce.client.dto.catalog.review.ReviewDto;
import com.turkcell.ecommerce.client.resource.catalog.review.ReviewResource;
import com.turkcell.ecommerce.common.mapper.BaseMapper;

/**
 * @author Selahaddin Akgun
 */
@Mapper(componentModel = "spring")
public interface ReviewMapper extends BaseMapper<Review, ReviewDto, ReviewResource> {
}
