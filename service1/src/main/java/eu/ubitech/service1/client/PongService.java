package eu.ubitech.service1.client;

import hello.IPongService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("service2")    //It should not be component scanned
public interface PongService extends IPongService {
}