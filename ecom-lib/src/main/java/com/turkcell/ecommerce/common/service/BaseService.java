package com.turkcell.ecommerce.common.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.turkcell.ecommerce.common.data.entity.AbstractEntity;
import com.turkcell.ecommerce.common.data.repository.BaseRepository;

/**
 * @author Selahaddin Akgun
 */
public abstract class BaseService<Entity extends AbstractEntity> extends BaseServiceProxy<Entity, BaseRepository<Entity>> {

	public List<Entity> getAll() {
		return getRepository().findAll();
	}

	public Page<Entity> getAll(Pageable pageable) {
		return getRepository().findAll(pageable);
	}

	public Optional<Entity> get(Long id) {
		return getRepository().findById(id);
	}

	public Optional<Entity> put(Long id, Entity entity) {
		entity.setIdentifier(id);
		return save(entity);
	}

	public Optional<Entity> save(Entity entity) {
		Entity save = getRepository().save(entity);
		return Optional.of(save);
	}

	public void delete(Long id) {
		getRepository().deleteById(id);
	}

}
