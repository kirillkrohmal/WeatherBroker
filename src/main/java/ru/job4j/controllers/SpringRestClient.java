package ru.job4j.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.job4j.models.Location;

import static sun.plugin.javascript.navig.JSType.Location;

public class SpringRestClient {
    @RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public SpringRestClient getForObjectJsonDemo(@PathVariable(value = "id") Integer id) {
        Location location = new Location("");
        return new SpringRestClient();
    }
}
