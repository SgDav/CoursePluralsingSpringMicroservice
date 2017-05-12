package com.example;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
public class PluralsightSpringcloudM4SecureserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM4SecureserviceApplication.class, args);
	}
	
	@RequestMapping()
	public ArrayList<TollUsage> getTollUsage(){
		TollUsage instance1 = new TollUsage("100", "station50", "B4GTHS", "2016-09-15T06:31:31");
		TollUsage instance2 = new TollUsage("101", "station51", "B5GTHS", "2016-09-15T06:34:31");
		TollUsage instance3 = new TollUsage("102", "station52", "B6GTHS", "2016-09-15T06:32:31");
		TollUsage instance4 = new TollUsage("103", "station53", "B7GTHS", "2016-09-15T06:33:31");
		
		ArrayList<TollUsage> tolls = new ArrayList<TollUsage>();
		tolls.add(instance1);
		tolls.add(instance2);
		tolls.add(instance3);
		tolls.add(instance4);
		return tolls;
	}
	
	public class TollUsage{
		public String Id;
		public String stationId;
		public String licensePlate;
		public String timestamp;
		
		public TollUsage(){}
		
		public TollUsage(String id, String stationid, String licenseplate, String timestamp){
			this.Id = id;
			this.stationId = stationid;
			this.licensePlate = licenseplate;
			this.timestamp = timestamp;
		}
	}
}
