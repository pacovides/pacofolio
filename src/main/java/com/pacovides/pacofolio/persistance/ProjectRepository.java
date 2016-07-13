package com.pacovides.pacofolio.persistance;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pacovides.pacofolio.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	List<Project> findByName(String name);

}
