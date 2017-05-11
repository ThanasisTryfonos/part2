package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IPingService {
    @RequestMapping("/ping")
    String ping();  
    
    @RequestMapping("/ping/{msg}")
    PartResponse ping(@PathVariable("msg") String msg);    
    
}//EoI
