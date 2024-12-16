package com.mysite.sbb_practice3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    public String root() {
        return "/question/list";
    }

}
