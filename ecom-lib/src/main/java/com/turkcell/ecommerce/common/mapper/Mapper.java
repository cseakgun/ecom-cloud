package com.turkcell.ecommerce.common.mapper;

import com.turkcell.ecommerce.common.data.entity.BaseEntity;
import com.turkcell.ecommerce.common.resource.dto.AbstractDto;
import com.turkcell.ecommerce.common.resource.resource.AbstractResource;

/**
 * @author Selahaddin Akgun
 */
public interface Mapper<Entity extends BaseEntity, DTO extends AbstractDto, Resource extends AbstractResource> {

	public abstract Resource toResource(Entity paramEntity);
	public abstract Entity toEntity(DTO dto);

}
