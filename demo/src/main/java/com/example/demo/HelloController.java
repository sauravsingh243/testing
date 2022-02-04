package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.*;

@RestController
public class HelloController {

    // receives requests to http://IP-address-of-host/
	@RequestMapping("/")
	public String index() {
    	InetAddress ip = null;
		String retString = "";
      		try {
        		 ip = InetAddress.getLocalHost();
			 
      		}
     		 catch (Exception e) {
	 	       return "Internal error encountered in server " + ip + " !";
      		}
	  	return retString + "Greetings from Spring Boot running at " + ip + " !";
	}

}
