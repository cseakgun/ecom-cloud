package com.turkcell.ecommerce.common.controller;

import com.turkcell.ecommerce.client.dto.AbstractDto;
import com.turkcell.ecommerce.client.resource.AbstractResource;
import com.turkcell.ecommerce.common.data.entity.AbstractEntity;
import com.turkcell.ecommerce.common.mapper.BaseMapper;
import com.turkcell.ecommerce.common.service.BaseService;

/**
 * @author Selahaddin Akgun
 */
public abstract class BaseController<Entity extends AbstractEntity, DTO extends AbstractDto, Resource extends AbstractResource, Service extends BaseService<Entity>, M extends BaseMapper<Entity, DTO, Resource>> {
	protected abstract Service getService();

	protected abstract M getMapper();
}
