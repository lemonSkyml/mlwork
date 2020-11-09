package com.mlwork.parent.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * All rights Reserved, Designed By dumingchun
 * @Description: TODO
 * @author: ml
 * @date:   2019年8月26日 下午8:46:42
 * @version: 
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@EnableDiscoveryClient
public class MlWorkConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MlWorkConfigApplication.class, args);
		
        System.out.println(
        "====================================================================================================================");
        System.out.println("");
        System.out.println("                                               mlwork Config Server Runing......");
        System.out.println("");
        System.out.println(
        	"====================================================================================================================");
	}
}
