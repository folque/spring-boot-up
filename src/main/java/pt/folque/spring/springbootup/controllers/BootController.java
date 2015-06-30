package pt.folque.spring.springbootup.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Diogo on 30-Jun-15.
 */
@RequestMapping("/api")
@RestController
public class BootController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String boot(){
        return "Spring has booted up successfully!";
    }
}
