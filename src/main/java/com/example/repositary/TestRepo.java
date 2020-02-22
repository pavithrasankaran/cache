package com.example.repositary;

import java.util.Optional;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Test;

@CacheConfig(cacheNames = "customer-cache")
public interface TestRepo extends JpaRepository<Test , Integer>{
	
	@Cacheable
	Optional<Test> findById(Integer id);
}
