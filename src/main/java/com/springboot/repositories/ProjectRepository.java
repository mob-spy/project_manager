package com.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}
