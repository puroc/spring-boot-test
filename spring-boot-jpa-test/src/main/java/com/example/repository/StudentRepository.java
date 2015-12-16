package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Student;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

	// List<Course> findByLastName(@Param("name") String name);

}
