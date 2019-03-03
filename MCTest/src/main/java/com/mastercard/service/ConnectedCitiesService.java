package com.mastercard.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastercard.repository.CitiesRepository;

@Service
public class ConnectedCitiesService {
	
	private static final Logger logger = LoggerFactory.getLogger(ConnectedCitiesService.class);
	 @Autowired
	 CitiesRepository citiesRepository;
	 
	public CitiesRepository getCitiesRepository() {
		return citiesRepository;
	}

	public void setCitiesRepository(CitiesRepository citiesRepository) {
		this.citiesRepository = citiesRepository;
	}

	@Autowired
	public ConnectedCitiesService(){
		 super();
	}
	
	

   
	public String connected(String origin,String destination){
		System.out.println(origin);
		System.out.println(destination);
		return citiesRepository.connected(origin, destination);
		
	}
}
