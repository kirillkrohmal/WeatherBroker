package ru.job4j.controllers;


import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.wildfly.security.ssl.Authentication;
import ru.job4j.models.Location;
import ru.job4j.repositories.LocationProfileService;


@Controller
@RequestMapping("/models/requests/open")
public class SpringRestController {
    private static final Logger log = LoggerFactory.getLogger(SpringRestController.class);

    private static final String VIEW_REQUESTS = "/location";
    private static final String JSON_UTF_8 = "application/json;charset=UTF-8";
    private static final String ACCEPT_JSON_UTF_8 = "Accept=" + JSON_UTF_8;


    @Autowired
    LocationProfileService repositories;
    @Autowired
    MessageSource messageSource;



    @RequestMapping(value = VIEW_REQUESTS, method = RequestMethod.POST)
    public String edit(@ModelAttribute Location location) {
        //location.getCity(this.repositories.findByFullnameLike(new Location(location.getCity())));
        this.repositories.save(location);
        return "redirect:/location.do";
    }
}



