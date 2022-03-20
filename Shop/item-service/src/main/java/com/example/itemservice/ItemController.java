package com.example.itemservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/items")
@RestController
public class ItemController {
    private List<Item> items = Arrays.asList(
            new Item(1, "Joe Bloggs"),
            new Item(2, "Jane Doe"));
    
    @GetMapping
    public List<Item> getAllItems() {
        return items;
    }
    
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return items.stream()
                        .filter(item -> item.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}
