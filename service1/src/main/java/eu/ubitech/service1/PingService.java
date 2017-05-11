package eu.ubitech.service1;

import hello.IPingService;
import hello.PartResponse;
import java.util.Date;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PingService implements IPingService{

    private static final Logger logger = Logger.getLogger(PingService.class.getName());

    
    
    @Override
    public String ping() {
        logger.info("ping");
        return "ping";
    }//EoM

    @Override
    public PartResponse ping(@PathVariable("msg")String msg) {
        PartResponse resp = new PartResponse("ping"+msg);
        resp.setAmount(2231);
        resp.setDate(new Date());
        logger.info("ping");        
        return resp; 
    }//EoM

    
}//EoC
