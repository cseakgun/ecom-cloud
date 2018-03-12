package com.turkcell.ecommerce.common.resource.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Selahaddin Akgun
 */
@Data
public class AbstractDto implements Serializable {
	private static final long serialVersionUID = 1L;

	protected Long identifier;
}
