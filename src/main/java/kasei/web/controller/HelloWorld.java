package kasei.web.controller;

import kasei.web.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.FormContentFilter;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorld {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String get(){
        return helloWorldService.getHelloWorldString() ;

    }

}
