package eu.ubitech.service2;

import eu.ubitech.service2.client.PingService;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Console {

    private static final Logger logger = Logger.getLogger(Console.class.getName());
    @Autowired
    private PingService pingservice;    
    
    @RequestMapping("/test2")   //Ping Tester
    public String test() {
        String ret1 = pingservice.ping();
        logger.info(ret1);
        return ret1;
    }//EoM

    @RequestMapping("/test2/{msg}") //Ping Tester
    public String test(@PathVariable("msg") String msg) {
        String ret1 = pingservice.ping(msg).getMsg();
        logger.info(ret1);
        return ret1;
    }//EoM      
    
}//EoC 
