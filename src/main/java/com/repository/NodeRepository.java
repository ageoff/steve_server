package com.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.domain.Node;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface NodeRepository extends CrudRepository<Node, Long> {
	@Query("SELECT n FROM Node n WHERE n.tree = ?1")
	List<Node> getTrees(boolean tree);

}
