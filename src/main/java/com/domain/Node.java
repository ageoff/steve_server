package com.domain;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "nodes", schema="steve")
public class Node {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
		private String uuid;
		private String name;
		private Long value;
		@OneToMany(cascade = CascadeType.PERSIST)
		@JoinTable(name="node_parents",
			joinColumns=@JoinColumn(name="parent_id"),
			inverseJoinColumns=@JoinColumn(name="node_id"))
		private List<Node> children;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

		public String getUUID() {
			return uuid;
		}

		public void setUUID(String uuid) {
			this.uuid = uuid;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Long getValue() {
			return value;
		}

		public void setValue(Long value) {
			this.value = value;
		}

		public List<Node> getChildren() {
			return children;
		}

		public void setChildren(List<Node> children) {
			this.children = children;
		}

}
