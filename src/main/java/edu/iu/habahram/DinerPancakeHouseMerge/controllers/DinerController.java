package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/diner")
public class DinerController {

    DinerRepository repository;

    public DinerController(DinerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public MenuItem[] get() {
        Iterator<MenuItem> iterator = repository.getTheMenuIterator();
        List<MenuItem> items = new ArrayList<>();
        while(iterator.hasNext()) {
            items.add(iterator.next());
        }
        return items.toArray(new MenuItem[0]);
    }
}
