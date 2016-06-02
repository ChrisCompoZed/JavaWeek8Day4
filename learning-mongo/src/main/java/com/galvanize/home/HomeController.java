package com.galvanize.home;

/**
 * Created by localadmin on 02/06/2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index () {

        return "home/index";
    }
}
