package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path = "/add/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String sum (@PathVariable int num1, @PathVariable int num2) {
        return "Adding "+ num1 + " and " + num2 + " equals: "+ (num1+num2);
    }

    @RequestMapping(path = "/subtract/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract (@PathVariable int num1, @PathVariable int num2) {
        return "Subtract "+ num2 + " from " + num1 + " equals: "+ (num1-num2);
    }
    @RequestMapping(path = "/multiply/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply (@PathVariable int num1, @PathVariable int num2) {
        return "multiply "+ num1 + " and " + num2 + " equals: "+ (num1*num2);
    }
    @RequestMapping(path = "/divide/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide (@PathVariable int num1, @PathVariable int num2) {
        return "divide "+ num1 + " by " + num2 + " equals: "+ (num1/num2);
    }
}

