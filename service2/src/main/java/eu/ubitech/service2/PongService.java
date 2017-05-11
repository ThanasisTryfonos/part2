package eu.ubitech.service2;

import hello.IPongService;
import hello.PartResponse;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongService implements IPongService{

    @Override
    public String pong() {
        return "pong";
    }

    @Override
    public PartResponse pong(String msg) {
               return new PartResponse("pong"+msg);
    }
    
}//EoC
