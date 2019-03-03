package com.mastercard.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;












import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;

@Configuration
public class Config {
	  private final static Logger logger = LoggerFactory.getLogger(Config.class);

	   // @Value("classpath:#{systemProperties.mapping}")
	    // or @Value("file:#{systemProperties.mapping}")
	    //@Value("classpath:cities.txt")
	  
	    @Bean(name="mapping")
	    public Map<String,String> getMapping() {
	    	File file=null;
			try {
				file = ResourceUtils.getFile("classpath:cities.txt");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        Map<String,String> mapping = new HashMap<>();
	        try{
	        	
	        	BufferedReader br = new BufferedReader(new FileReader(file));
	        	String line;
	        	while ((line = br.readLine()) != null) {
	        		String originLoad = line.substring(0,line.indexOf(','));
	               
	                String destinationLoad =line.substring(line.indexOf(',')+1);;
	                mapping.put(originLoad,destinationLoad);
	            }
	        } catch (IOException e) {
	            logger.error("could not load mapping file",e);
	        }
	        return mapping;
	    }
}

