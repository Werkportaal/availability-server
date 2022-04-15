package Werkportaal.availabilityserver.service;

import Werkportaal.availabilityserver.model.Availability;
import Werkportaal.availabilityserver.repository.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvailabilityService {

    @Autowired
    private final AvailabilityRepository availabilityRepository;

    public AvailabilityService(AvailabilityRepository availabilityRepository) {
        this.availabilityRepository = availabilityRepository;
    }

    public List<Availability> findAll() {
        return availabilityRepository.findAll();
    }
}
