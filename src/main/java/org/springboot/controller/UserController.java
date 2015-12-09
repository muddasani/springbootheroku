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
    public @ResponseBody User getRequesterDetails(@RequestParam(value="email", required=false, defaultValue="xyz123@gmail.com") String name) {
        return new User("1239996780");
    }
    

}
