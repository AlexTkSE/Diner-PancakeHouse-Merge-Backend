package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.Menu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.model.PancakeHouseMenu;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;


@Repository
public class PancakeHouseRepository {
    public Iterator<MenuItem> getTheMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        return pancakeHouseMenu.createIterator();
    }
}
