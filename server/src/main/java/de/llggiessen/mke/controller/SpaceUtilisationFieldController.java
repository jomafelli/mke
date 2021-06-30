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

    @GetMapping("")
    public Iterable<SpaceUtilisationField> getSpaceUtilisationField() {
        return repository.findAll();
    }

    @DeleteMapping("")
    public void deleteAll() {
        repository.deleteAll();
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
