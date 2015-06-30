package pt.folque.spring.springbootup.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pt.folque.spring.springbootup.models.Sample;
import pt.folque.spring.springbootup.repositories.SampleRepo;

import java.util.List;


/**
 * Created by Diogo on 30-Jun-15.
 */
@RequestMapping("/api")
@RestController
public class BootController {

    @Autowired
    SampleRepo sampleRepo;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String boot(){
        List<Sample> samples = sampleRepo.findAll();
        String last = StringUtils.join(samples, ',');
        String first = samples.get(0).getOne();
        return "LAST IS: " + last + " FIRST IS: " + first;
    }
}
