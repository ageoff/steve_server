package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.domain.Node;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface NodeRepository extends CrudRepository<Node, Long> {

}
