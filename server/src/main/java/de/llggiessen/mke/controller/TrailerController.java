package de.llggiessen.mke.controller;

import de.llggiessen.mke.repository.TrailerRepository;
import de.llggiessen.mke.schema.Trailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path = "/trailer")
public class TrailerController {

    @Autowired
    TrailerRepository repository;

    @GetMapping(value = "", params = "id")
    public Trailer getTrailerById(@RequestParam Long id) {
        return repository.findById(id).orElseThrow(()->{
            return new ResponseStatusException(HttpStatus.BAD_REQUEST);
        });
    }

    @GetMapping(value = "", params = "price")
    public Iterable<Trailer> getTrailerByPrice(@RequestParam int price) {
        return repository.findAllByPrice(price);
    }

    @GetMapping(value = "", params = "places")
    public Iterable<Trailer> getTrailerByPlaces(@RequestParam int places) {
        return repository.findAllByPlaces(places);
    }

    @PostMapping("")
    public Trailer createTrailer(@RequestBody Trailer trailer) {
        try {
            return repository.save(trailer);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
