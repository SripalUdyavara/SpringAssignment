package com.telusko.springMVC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


	@Repository
	public interface RepositorySaveName extends JpaRepository<SaveName, Integer> {
}

