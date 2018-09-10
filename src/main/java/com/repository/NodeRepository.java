package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.domain.Node;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface NodeRepository extends CrudRepository<Node, Long> {
	@Query("SELECT n.id, n.uuid, n.name, n.value, n.deleted, n.tree_node FROM Node n WHERE n.tree_node = ?1")
	Iterable<Node> getTrees(boolean tree_node);

}
