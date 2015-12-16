package com.example.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Course;


@RepositoryRestResource(collectionResourceRel = "course", path = "course")
public interface CourseRepository extends PagingAndSortingRepository<Course, Integer> {

	 Course findByName(@Param("name") String name);

}
