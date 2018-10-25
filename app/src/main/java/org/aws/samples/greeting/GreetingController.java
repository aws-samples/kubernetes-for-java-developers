package org.aws.samples.greeting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Arun Gupta
 */
@RestController
public class GreetingController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
