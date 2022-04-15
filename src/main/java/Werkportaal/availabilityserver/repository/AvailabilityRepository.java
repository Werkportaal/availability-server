package Werkportaal.availabilityserver.repository;


import Werkportaal.availabilityserver.model.Availability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailabilityRepository extends JpaRepository<Availability, String> {
}
