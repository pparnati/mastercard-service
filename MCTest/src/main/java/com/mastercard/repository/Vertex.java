package com.mastercard.repository;

import java.util.ArrayList;
import java.util.List;


public class Vertex {

    private String name;

    private boolean visited;
    private Vertex right;
    public Vertex getLeft() {
		return left;
	}

	public void setLeft(Vertex left) {
		this.left = left;
	}


	private Vertex left;

    public  Vertex(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
		return visited;
	}


	public void setVisited(boolean visited) {
		this.visited = visited;
	}


	public Vertex getRight() {
		return right;
	}


	public void setRight(Vertex right) {
		this.right = right;
	}


	@Override
    public String toString() {
        return  name ;
    }


}
