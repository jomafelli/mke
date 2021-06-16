package de.llggiessen.mke.controller;

import de.llggiessen.mke.repository.InventoryRepository;
import de.llggiessen.mke.schema.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/inventory")
public class InventoryController {
    @Autowired
    InventoryRepository repository;

    @GetMapping("")
    public Iterable<Inventory> getInventory() {

        return repository.findAll();
    }
}
