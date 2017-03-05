package com.richard.Controller;

/**
 * Created by highl on 02/03/2017.
 */

import com.richard.Domain.ScriptList;
import com.richard.Service.ScriptManagerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * created by highl
 */
@RestController
public class TestController {

    private ScriptManagerService scriptManagerService;


    @Inject
    public TestController(ScriptManagerService scriptManagerService ){
        this.scriptManagerService = scriptManagerService;
    }



    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("hello world", HttpStatus.OK);
    }


    @RequestMapping(value = "/scripts", method = RequestMethod.GET)
    public ResponseEntity<ScriptList> getScripts(){

        return new ResponseEntity<ScriptList>(scriptManagerService.getScriptList(),HttpStatus.OK);

    }
}
