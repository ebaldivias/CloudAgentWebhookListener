package gov.ny.webhook.controller;

import gov.ny.webhook.model.WebhookRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhooks")
@Validated
public class AcaPyController {
    private static final Logger logger = LoggerFactory.getLogger(AcaPyController.class);

    @PostMapping(path="/topic/connections")
    @CrossOrigin
    public Boolean getConnectionId(@RequestBody WebhookRequest request){
        logger.debug("{} /getConnectionId endpoint accessed", Thread.currentThread().getStackTrace()[2].getMethodName());

        Boolean retrievedConnectionId = false;
        if(request.getConnection_id() != null && !StringUtils.isEmpty(request.getConnection_id())) {
            retrievedConnectionId = true;
            System.out.println("connection_id = " + request.getConnection_id());
        }else{
            System.out.println("connection_id = blank or null" );
        }
         return retrievedConnectionId;
    }

}
