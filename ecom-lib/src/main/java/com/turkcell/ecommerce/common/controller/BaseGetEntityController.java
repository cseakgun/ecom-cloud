package com.turkcell.ecommerce.common.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.turkcell.ecommerce.client.dto.AbstractDto;
import com.turkcell.ecommerce.client.resource.AbstractResource;
import com.turkcell.ecommerce.common.data.entity.AbstractEntity;
import com.turkcell.ecommerce.common.mapper.BaseMapper;
import com.turkcell.ecommerce.common.service.BaseService;

/**
 * @author Selahaddin Akgun
 */
@Component
public abstract class BaseGetEntityController<DTO extends AbstractDto, Entity extends AbstractEntity, Resource extends AbstractResource, Service extends BaseService<Entity>> extends BaseController<Entity, DTO, Resource, Service, BaseMapper<Entity, DTO, Resource>> {

	@GetMapping("/all")
	public ResponseEntity<List<Resource>> getAll() throws URISyntaxException {
		List<Entity> entityList = getService().getAll();

		List<Resource> list = new ArrayList<>();
		if (!entityList.isEmpty()) {
			entityList.forEach(c -> {
				list.add(getMapper().toResource(c));
			});
		}

		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/pageable/all")
	public ResponseEntity<List<Resource>> getAll(Pageable pageable) throws URISyntaxException {
		Page<Entity> page = getService().getAll(pageable);

		List<Resource> list = new ArrayList<>();
		List<Entity> entityList = page.getContent();
		if (!entityList.isEmpty()) {
			entityList.forEach(c -> {
				list.add(getMapper().toResource(c));
			});
		}

		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Resource> get(@Valid @PathVariable Long id) {
		Optional<Entity> expression = getService().get(id);

		return expression.map(result -> new ResponseEntity<>(getMapper().toResource(result), HttpStatus.OK))
				.orElse(new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
	}
}
