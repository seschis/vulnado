package com.scalesec.vulnado;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.*;

import java.io.Serializable;

@RestController
@EnableAutoConfiguration
public class CowController {
    @RequestMapping(value = "/cowsay")
    String cowsay(@RequestParam(defaultValue = "I love Linux!") String input) {
        return Cowsay.run(input);
    }

    @RequestMapping(value = "/cowsay2")
    String cowsay2(@RequestParam(defaultValue = "I love Linux!") String input) {
        return Cowsay.run2(input);
    }
}
