package eu.ubitech.service1;

import eu.ubitech.service1.client.PongService;
import eu.ubitech.service1.producer.Sender;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Console {

    @Value("${p1:2}")
    private String p1;
    
    private static final Logger logger = Logger.getLogger(Console.class.getName());
    
    @Autowired
    private PongService pongservice;
    
    @RequestMapping("/test1")   //Ping Tester
    public String test1() {
        String ret1 = pongservice.pong();
        logger.info(ret1);
        return ret1+"config_of_p1:"+p1;
    }//EoM

    @Autowired
    Sender kafkasender;
    
    @RequestMapping("/test11/{msg}")   //Ping Tester
    public void test11(@PathVariable("msg") String msg) {
        kafkasender.send("test", msg);
    }//EoM    
    
    
    
    @RequestMapping("/test1/{msg}") //Ping Tester
    public String test1(@PathVariable("msg") String msg) {
        String ret1 = pongservice.pong(msg).getMsg();
        logger.info(ret1);
        return ret1;
    }//EoM      
    
}//EoC
