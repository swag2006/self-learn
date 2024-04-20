package com.arnskesh.toggle.controller;

import com.arnskesh.toggle.service.ToggleService;
import com.arnskesh.toggle.vo.GreetingsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api")
public class ToggleDemoController {

    final
    ToggleService toggleService;

    public ToggleDemoController(ToggleService toggleService) {
        this.toggleService = toggleService;
    }

    @GetMapping("hello")
    @ResponseBody
    public ResponseEntity<GreetingsEntity> getFeatureMessage() {


        return new ResponseEntity<GreetingsEntity>(toggleService.getMessage(), HttpStatus.OK);

    }
}
