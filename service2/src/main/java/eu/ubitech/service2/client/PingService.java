package eu.ubitech.service2.client;

import hello.IPingService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("service1")
public interface PingService extends IPingService {
}