package com.pattern.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicsRepository extends CrudRepository<DataResponse, Long> {
}
