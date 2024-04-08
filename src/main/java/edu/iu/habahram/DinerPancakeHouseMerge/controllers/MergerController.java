package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItemRecord;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergerRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class MergerController {

    MergerRepository mergerRepository;

    public MergerController(MergerRepository mergerRepository) {
        this.mergerRepository = mergerRepository;
    }

    @GetMapping("/merger")
    public List<MenuItemRecord> get() {
        List<MenuItemRecord> i = mergerRepository.getTheMenuItems();
        return i;
    }

    @GetMapping("/vegetarian")
    public List<MenuItemRecord> getVegetarian() {
        List<MenuItemRecord> i = mergerRepository.getVegetarianMenuItems();
        return i;
    }

    @GetMapping("/breakfast")
    public List<MenuItemRecord> getBreakfast() {
        List<MenuItemRecord> i = mergerRepository.getBreakfastMenuItems();
        return i;
    }

    @GetMapping("/lunch")
    public List<MenuItemRecord> getLunch() {
        List<MenuItemRecord> i = mergerRepository.getLunchMenuItems();
        return i;
    }

    @GetMapping("/supper")
    public List<MenuItemRecord> getDinner() {
        List<MenuItemRecord> i = mergerRepository.getDinnerMenuItems();
        return i;
    }
}
