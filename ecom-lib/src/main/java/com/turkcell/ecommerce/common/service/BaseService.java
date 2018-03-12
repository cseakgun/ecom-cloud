package com.turkcell.ecommerce.common.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.turkcell.ecommerce.common.data.entity.BaseEntity;
import com.turkcell.ecommerce.common.data.repository.BaseRepository;

/**
 * @author Selahaddin Akgun
 */
public abstract class BaseService<Entity extends BaseEntity, ID extends Serializable> {
	public abstract BaseRepository<Entity, ID> getRepository();

	public List<Entity> getAll() {
		return getRepository().findAll();
	}

	public Page<Entity> getAll(Pageable pageable) {
		return getRepository().findAll(pageable);
	}

	public Optional<Entity> get(ID id) {
		return getRepository().findById(id);
	}
	
	public Optional<Entity> put(ID id, Entity entity) {
		entity.setIdentifier((Long) id);
		return save(entity);
	}

	public Optional<Entity> save(Entity entity) {
		Entity save = getRepository().save(entity);
		return Optional.of(save);
	}
	
	public void delete(ID id) {
		getRepository().deleteById(id);
	}

}
