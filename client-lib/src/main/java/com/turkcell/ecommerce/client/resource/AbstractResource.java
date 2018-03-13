package com.turkcell.ecommerce.client.resource;

import java.io.Serializable;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Selahaddin Akgun
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@EqualsAndHashCode(callSuper = false)
public class AbstractResource extends ResourceSupport implements Serializable {
	private static final long serialVersionUID = 1L;

	protected Long identifier;
	protected String createdDate;
	protected String lastModifiedDate;
	protected String createdBy;
	protected String lastModifiedBy;
}
