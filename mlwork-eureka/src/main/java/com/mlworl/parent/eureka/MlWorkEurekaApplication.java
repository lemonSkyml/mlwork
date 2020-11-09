package com.mlworl.parent.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author miaolong
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class MlWorkEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(MlWorkEurekaApplication.class, args);

		System.out.println("====================================================================================================================");
		System.out.println("");
		System.out.println("                                               MlWork Eureka Server Runing......");
		System.out.println("");
		System.out.println("====================================================================================================================");
	}

}
