package com.turkcell.ecommerce.common.data.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import com.turkcell.ecommerce.common.data.entity.BaseEntity;

/**
 * @author Selahaddin Akgun
 */
@NoRepositoryBean
public abstract interface BaseRepository<T extends BaseEntity, ID extends Serializable>
		extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
}