package net.shop.haha.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {

    @GetMapping("/")
    public String mainP() {
        log.info("Controller 진입");
        log.debug("Controller ");
        log.error("Controller ");
        return "main";
    }
}

