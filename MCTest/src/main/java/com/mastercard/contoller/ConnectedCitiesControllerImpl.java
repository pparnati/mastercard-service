package com.mastercard.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.service.ConnectedCitiesService;

@RestController
public class ConnectedCitiesControllerImpl {

	 private ConnectedCitiesService connectedService;

     private static final Logger logger = LoggerFactory.getLogger(ConnectedCitiesControllerImpl.class);

     @Autowired
     public ConnectedCitiesControllerImpl(ConnectedCitiesService connectedService) {
                     super();
                     this.connectedService = connectedService;
     }

     @RequestMapping(value="/connected" ,params={ "origin", "destination" }, method=RequestMethod.GET )
     @ResponseBody
     public String areCitiesConnected(String origin,String destination){
    	return connectedService.connected( origin, destination);
     }
}
