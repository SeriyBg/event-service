package com.explorer.event;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/event")
public class EventController {

    @GetMapping("/meteor")
    public Meteor meteor() {
        return Meteor.generateNew();
    }

    @GetMapping("/water")
    public Water water() {
        return Water.generate();
    }

    @GetMapping("/ground")
    public GroundEvent ground() {
        return GroundEvent.generate();
    }
}
