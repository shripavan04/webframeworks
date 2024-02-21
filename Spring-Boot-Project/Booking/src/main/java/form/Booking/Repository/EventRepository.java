package form.Booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import form.Booking.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}

