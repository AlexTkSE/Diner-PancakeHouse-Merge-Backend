package edu.iu.habahram.DinerPancakeHouseMerge.controllers;


import edu.iu.habahram.DinerPancakeHouseMerge.model.DinerMenuIterator;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.iu.habahram.DinerPancakeHouseMerge.model.Iterator;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {

    DinerRepository dinerRepository;
    PancakeHouseRepository pancakeHouseRepository;

    public MergerController(PancakeHouseRepository pancakeHouseRepository, DinerRepository dinerRepository){
        this.pancakeHouseRepository = pancakeHouseRepository;
        this.dinerRepository = dinerRepository;
    }

    @GetMapping
    public List<MenuItem> get(){
        MenuItem[] dinerMenu = dinerRepository.getTheMenu();

        Iterator dinerIter = new DinerMenuIterator(dinerMenu);
        List<MenuItem> splitDinerMenuList = new ArrayList<>();

        while (dinerIter.hasNext()){
            splitDinerMenuList.add((MenuItem) dinerIter.next());
        }

        Iterator pancakeHouseIter = new DinerMenuIterator(dinerMenu);
        List<MenuItem> splitPancakeHouseMenuList = new ArrayList<>();

        while (pancakeHouseIter.hasNext()){
            splitPancakeHouseMenuList.add((MenuItem) pancakeHouseIter.next());
        }

        return splitDinerMenuList;
    }
}
