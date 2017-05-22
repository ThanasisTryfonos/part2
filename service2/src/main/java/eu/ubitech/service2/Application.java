package eu.ubitech.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient      //registration of service to eureka
@EnableFeignClients         //@FeignClient scanner (config)  
@EnableEurekaClient         //For service consumption (rest template automation) GIVEN that a client-interface has @FeignClient annotation  (it must be acompanied by FeignClient)
@EnableHystrix              //It must be accompanied by ServletConfig
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({
    "eu.ubitech.service2"
//    ,"eu.ubitech.service2.consumer"        
        //,"eu.ubitech.service2.client"    
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}//EoC