package alphaBetaPruning;

import java.util.*;

public class Node {
	private String name;
    private Integer value;
    private List<Node> children;

    public Node(String name,Integer value) {
    	this.name=name;
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }
    
    public Integer getValue() {
    	return this.value;
    }
    
    public List<Node> getChildren(){
    	return this.children;
    }
    public String getName() {
    	return this.name;
    }

    
}
