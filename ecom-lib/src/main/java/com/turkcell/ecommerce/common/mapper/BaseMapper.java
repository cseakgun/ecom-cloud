package com.turkcell.ecommerce.common.mapper;

import com.turkcell.ecommerce.client.dto.AbstractDto;
import com.turkcell.ecommerce.client.resource.AbstractResource;
import com.turkcell.ecommerce.common.data.entity.AbstractEntity;

/**
 * @author Selahaddin Akgun
 */
public interface BaseMapper<Entity extends AbstractEntity, DTO extends AbstractDto, Resource extends AbstractResource> {
	public Resource toResource(Entity paramEntity);
	public Entity toEntity(DTO dto);
}
