package com.turkcell.ecommerce.common.data.entity.listener;

import java.time.ZonedDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.stereotype.Component;

import com.turkcell.ecommerce.common.data.entity.BaseEntity;

/**
 * @author Selahaddin Akgun
 */
@Component
public class AuditingEntityListener {
	@PrePersist
	@PreUpdate
	public void setLastModifiedDate(BaseEntity entity) {
		if (entity.getIdentifier() == null) {
			entity.setCreatedDate(ZonedDateTime.now());
		}
		entity.setLastModifiedDate(ZonedDateTime.now());
	}
}
