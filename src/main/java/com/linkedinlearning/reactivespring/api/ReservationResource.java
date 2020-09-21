package com.linkedinlearning.reactivespring.api;

import com.linkedinlearning.reactivespring.model.Reservation;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(ReservationResource.ROOM_V_1_RESERVATION)
@CrossOrigin
public class ReservationResource {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    @GetMapping(path = "{roomId}", produces = APPLICATION_JSON_VALUE)
    public Mono<String> getReservationById(@PathVariable String roomId) {
        return Mono.just("{}");
    }

    @PostMapping(path = "", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public Mono<String> createReservation(@RequestBody Mono<Reservation> reservation)
    {
        return Mono.just("{}");
    }

    @PutMapping(path = "{roomId}", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public Mono<String> updateReservation(@PathVariable String roomId,
                                          @RequestBody Mono<Reservation> reservation)
    {
        return Mono.just("{}");
    }
}
