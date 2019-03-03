package com.mastercard.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CitiesRepository {

	@Autowired
    @Qualifier("mapping")
    private Map<String,String> mapping;
	
	public String connected(String origin, String destination){
	     HashMap<Vertex,Vertex> vertexMap = new HashMap<Vertex,Vertex>();
	     System.out.println("1");
	        System.out.println("2");
		for(Entry<String, String> e : mapping.entrySet()) {
	        String originLoad = e.getKey();
	        String destinationLoad = e.getValue();
	        System.out.println(originLoad);
	        System.out.println(destinationLoad);
	        Vertex vertexOrigin = new Vertex(originLoad);
	        Vertex vertexDest = new Vertex(destinationLoad);
	        vertexOrigin.setRight(vertexDest);
	        vertexDest.setLeft(vertexOrigin);
	        vertexMap.put(vertexOrigin, vertexDest);
	    }
		
       
		
	        Algorithm algorithm = new Algorithm();
	        String answer="";
	        System.out.println("answer is "+ algorithm.computePaths(new Vertex(origin),new Vertex(destination),vertexMap,"").contains(destination));
	        if(algorithm.computePaths(new Vertex(origin),new Vertex(destination),vertexMap,"").contains(destination) ){
	        	
	        	answer="YES";
	        }else{
	        	answer="NO";
	        }

	        //System.out.println(algorithm.getShortestPath(vertexDest));
	        return answer; //algorithm.getShortestPath(vertexDest);
	}
	
	
	
}
