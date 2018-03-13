package com.turkcell.ecommerce.common.mapper;

import com.turkcell.ecommerce.client.dto.AbstractDto;
import com.turkcell.ecommerce.client.resource.AbstractResource;
import com.turkcell.ecommerce.common.data.entity.BaseEntity;

/**
 * @author Selahaddin Akgun
 */
public abstract interface Mapper<Entity extends BaseEntity, DTO extends AbstractDto, Resource extends AbstractResource> {

	public abstract Resource toResource(Entity paramEntity);
	public abstract Entity toEntity(DTO dto);

}
