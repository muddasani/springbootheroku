package org.springboot.controller;

import org.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    
    @RequestMapping(value = "/user", method=RequestMethod.GET)
    public @ResponseBody User getRequesterDetails(@RequestParam(value="email", required=false, defaultValue="xyz123@gmail.com") String email) {
        return new User("http://senldogocqs.springer-sbm.com:8003/sap/bc/bsp/sap/crm_ui_start/default.htm?crm-object-type=BP_ACCOUNT&crm-object-action=B&saprole=Z_SALESPRO&crm-object-keyname=PARTNER&crm-object-value=3000000027", email);
    }
    

}
