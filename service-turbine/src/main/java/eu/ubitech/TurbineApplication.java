package eu.ubitech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

//http://127.0.0.1:8080/hystrix/monitor?stream=http%3A%2F%2F127.0.0.1%3A8080%2Fturbine.stream

@EnableHystrixDashboard
@EnableTurbine
@EnableEurekaClient 
@SpringBootApplication
public class TurbineApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}
