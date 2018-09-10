package com.domain;

import javax.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "nodes", schema="steve")
@SQLDelete(sql="UPDATE nodes SET deleted = true WHERE id = ?")
@Where(clause="deleted = false")
public class Node {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
		private String uuid;
		private String name;
		private Long value;
		private boolean deleted;
		private boolean tree_node;
		@SQLDelete(sql="UPDATE nodes SET deleted = true WHERE id = ?")
		@OneToMany(cascade = CascadeType.ALL)
		@JoinTable(name="node_parents",
			joinColumns=@JoinColumn(name="parent_id"),
			inverseJoinColumns=@JoinColumn(name="node_id"))
		@Where(clause="deleted = false")
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

		public boolean getDeleted() {
			return deleted;
		}

		public void setDeleted(boolean deleted) {
			this.deleted = deleted;
		}

		public boolean getTreeNode() {
			return tree_node;
		}

		public void setTreeNode(boolean tree_node) {
			this.tree_node = tree_node;
		}

		public List<Node> getChildren() {
			return children;
		}

		public void setChildren(List<Node> children) {
			this.children = children;
		}

}
