package com.mastercard.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class Algorithm {

	 public String computePaths(Vertex sourceVertex,Vertex destVertex, HashMap<Vertex,Vertex> mapVert,String path){

	        System.out.println(sourceVertex.getName()+"------>>>");

	        path= sourceVertex.getName()+"-->";
	        for(Map.Entry<Vertex,Vertex> vertEntry :mapVert.entrySet()) {
	            Vertex origSourceVertex= vertEntry.getKey();
	            Vertex origDestVertex= vertEntry.getValue();
	            System.out.println("orig key"+origSourceVertex.getName());
	            if(origSourceVertex.getName().equals(sourceVertex.getName())){
	                path= path+computePaths(origSourceVertex.getRight(),vertEntry.getKey(),mapVert,path);
	            }
	            if(origSourceVertex.getName().equals(destVertex.getName())){
	            	 path= path+ destVertex.getName();
	            }else{
	            	//path= path+   computePaths(vertEntry.getKey(),mapVert,path);
	                System.out.println("did not find");

	            }
	           
	           
	        }
	        return path;
	    }


    
}
