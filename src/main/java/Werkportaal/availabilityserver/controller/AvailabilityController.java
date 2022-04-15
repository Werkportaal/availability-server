package Werkportaal.availabilityserver.controller;

import Werkportaal.availabilityserver.model.Availability;
import Werkportaal.availabilityserver.service.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/availability")
public class AvailabilityController {

    @Autowired
    AvailabilityService availabilityService;

    public AvailabilityController(AvailabilityService availabilityService) {this.availabilityService = availabilityService;}

    @GetMapping
    public List<Availability> findAll() {
        return availabilityService.findAll();
    }

}
