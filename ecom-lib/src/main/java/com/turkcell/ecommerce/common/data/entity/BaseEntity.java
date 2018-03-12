package com.turkcell.ecommerce.common.data.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import org.springframework.core.style.ToStringCreator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.turkcell.ecommerce.common.data.entity.listener.AuditingEntityListener;

/**
 * @author Selahaddin Akgun
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EntityListeners({ AuditingEntityListener.class })
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	protected Long identifier;
	@CreatedDate
	@Column(name = "created_date", nullable = false)
	protected ZonedDateTime createdDate = ZonedDateTime.now();
	@LastModifiedDate
	@Column(name = "last_modified_date")
	@JsonIgnore
	protected ZonedDateTime lastModifiedDate = ZonedDateTime.now();
	@CreatedBy
	@Column(name = "created_by", updatable = false)
	private String createdBy;
	@LastModifiedBy
	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	public Long getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}

	public ZonedDateTime getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public ZonedDateTime getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(ZonedDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int hashCode() {
		return Objects.hash(new Object[] { this.identifier });
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		return (getClass() == obj.getClass()) && (Objects.equals(this.identifier, ((BaseEntity) obj).identifier));
	}

	public String toString() {
		return toString(new ToStringCreator(this)).toString();
	}

	protected ToStringCreator toString(ToStringCreator creator) {
		return creator.append("id", getIdentifier());
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
}
