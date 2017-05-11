package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IPongService {
    @RequestMapping("/pong")
    String pong();  
    
    @RequestMapping("/pong/{msg}")
    PartResponse pong(@PathVariable("msg") String msg);    
    
}//EoI
