package com.turkcell.ecommerce.common.service;

import com.turkcell.ecommerce.common.data.entity.AbstractEntity;
import com.turkcell.ecommerce.common.data.repository.BaseRepository;

public abstract class BaseServiceProxy<Entity extends AbstractEntity, Repository extends BaseRepository<Entity>> {
	public abstract Repository getRepository();
}
