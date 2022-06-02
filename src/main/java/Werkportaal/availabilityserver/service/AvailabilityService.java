package Werkportaal.availabilityserver.service;

import Werkportaal.availabilityserver.model.Availability;
import Werkportaal.availabilityserver.repository.AvailabilityRepository;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
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


    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(value = "werkportaal_exchange", type = ExchangeTypes.TOPIC),
                    key = "rooster.test"))
    void listenForSubmittedClaims(String text) {

        System.out.println("Availability server:" + text);

    }
}
