package de.llggiessen.mke.controller;

import de.llggiessen.mke.repository.SpaceUtilisationFieldRepository;
import de.llggiessen.mke.schema.SpaceUtilisationField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path = "/space_utilisation_field")
public class SpaceUtilisationFieldController {

    @Autowired
    SpaceUtilisationFieldRepository repository;

    @GetMapping(value = "", params = "id")
    public SpaceUtilisationField getSpaceUtilisationFieldById(@RequestParam Long id) {
        return repository.findById(id).orElseThrow(()->{
            return new ResponseStatusException(HttpStatus.BAD_REQUEST);
        });
    }

    @GetMapping("")
    public Iterable<SpaceUtilisationField> getSpaceUtilisationFieldByType(@RequestParam(value = "type") String type) {
        return repository.findAllByType(type);
    }

    @PostMapping("")
    public SpaceUtilisationField createSpaceUtilisationField(@RequestBody SpaceUtilisationField spaceUtilisationField) {
        try {
            return repository.save(spaceUtilisationField);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
