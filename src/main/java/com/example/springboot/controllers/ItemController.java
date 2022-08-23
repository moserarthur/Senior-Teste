package com.example.springboot;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.Item;
import com.example.springboot.repositories.ItemRepository;



@RestController
public class ItemController {

    ItemRepository repository;



    @GetMapping("/item")
    public List<Item> getAllItems(){
        return repository.findAll();
    }

    @PostMapping("/item")
    public Item createItem(@RequestBody Item item) {
        return repository.save(item);
    }

    @GetMapping("/item/{id}")
    public Item loadById(@PathVariable Long id){
        return repository.getOne(id);
    }

    @DeleteMapping("/item/{id}")
    public void deleteItem(@PathVariable Long id) {
        repository.deleteById(id);
    }
}