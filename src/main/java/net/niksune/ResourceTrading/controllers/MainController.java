package net.niksune.ResourceTrading.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {

        return "index";
    }

}
