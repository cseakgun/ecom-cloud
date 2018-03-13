package com.turkcell.ecommerce.common.data.entity.listener;

import java.time.ZonedDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.stereotype.Component;

import com.turkcell.ecommerce.common.data.entity.AbstractEntity;

/**
 * @author Selahaddin Akgun
 */
@Component
public class AuditingEntityListener {
	@PrePersist
	@PreUpdate
	public void setLastModifiedDate(AbstractEntity entity) {
		if (entity.getIdentifier() == null) {
			entity.setCreatedDate(ZonedDateTime.now());
		}
		entity.setLastModifiedDate(ZonedDateTime.now());
	}
}
