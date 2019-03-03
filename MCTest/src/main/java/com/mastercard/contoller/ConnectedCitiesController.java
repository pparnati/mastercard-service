package com.mastercard.contoller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
public interface ConnectedCitiesController {
	
	@RequestMapping( value="/connected",  params={ "origin", "destination" }, method=RequestMethod.GET , produces =  MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String   areCitiesConnected(@RequestParam("origin") String origin, @RequestParam("destination") String destination) throws Exception;

}
