package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class PluralsightSpringcloudM3TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM3TaskApplication.class, args);
	}
	
	@Bean
	public TollProcessingTask tollProcessingTask(){
		return new TollProcessingTask();
	}
	public class TollProcessingTask implements CommandLineRunner{

		@Override
		public void run(String... strings) throws Exception {
			// TODO Auto-generated method stub
			if(null != strings){
				String stationid = strings[1];
				String licenseplate = strings[2];
				String timestamp = strings[3];
				
				System.out.println("Station ID is " + stationid + ", plate is "+ licenseplate 
						+ ", tmistamp is " + timestamp);
			}
		}
	}
}
