package com.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.domain.Node;
import com.repository.NodeRepository;

@RestController    // This means that this class is a Controller
@RequestMapping("/node") // This means URL's start with /user (after Application path)
public class NodeController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private NodeRepository nodeRepository;

	@RequestMapping("/all")
	public @ResponseBody Iterable<Node> getAllNodes() {
		// This returns a JSON or XML with the users
		return nodeRepository.findAll();
	}

	@PostMapping("/add")
	public Node newNode(@RequestBody Node newNode) {
		return nodeRepository.save(newNode);
	}

	@PostMapping("/update")
	public Node updateNode(@RequestBody Node node) {
		return nodeRepository.save(node);
	}

	@PostMapping("/delete")
	public void deleteNode(@RequestBody Node node) {
		nodeRepository.delete(node);
	}

}
