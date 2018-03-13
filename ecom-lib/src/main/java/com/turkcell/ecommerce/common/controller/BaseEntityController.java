package com.turkcell.ecommerce.common.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.turkcell.ecommerce.client.dto.AbstractDto;
import com.turkcell.ecommerce.client.resource.AbstractResource;
import com.turkcell.ecommerce.common.data.entity.AbstractEntity;
import com.turkcell.ecommerce.common.service.BaseService;

/**
 * @author Selahaddin Akgun
 */
@Component
public abstract class BaseEntityController<DTO extends AbstractDto, Entity extends AbstractEntity, Resource extends AbstractResource, Service extends BaseService<Entity>>
		extends BaseGetEntityController<DTO, Entity, Resource, Service> {

	@DeleteMapping({ "/{id}" })
	public void delete(@PathVariable("id") Long id) {
		getService().delete(id);
	}

	@PostMapping
	public ResponseEntity<Resource> save(@RequestBody @Valid DTO dto) {
		Optional<Entity> save = getService().save(getMapper().toEntity(dto));
		Resource resource = getMapper().toResource(save.get());

		return new ResponseEntity<>(resource, HttpStatus.CREATED);
	}

	@PutMapping({ "/{id}" })
	public ResponseEntity<Resource> put(@PathVariable("id") Long id, @RequestBody @Valid DTO dto) {
		Entity forSave = getMapper().toEntity(dto);
		Optional<Entity> put = getService().put(id, forSave);
		Resource resource = getMapper().toResource(put.get());

		return new ResponseEntity<>(resource, HttpStatus.OK);
	}
}