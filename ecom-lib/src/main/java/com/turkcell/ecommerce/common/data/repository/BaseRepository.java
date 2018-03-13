package com.turkcell.ecommerce.common.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import com.turkcell.ecommerce.common.data.entity.AbstractEntity;

/**
 * @author Selahaddin Akgun
 */
@NoRepositoryBean
public abstract interface BaseRepository<T extends AbstractEntity> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
}