package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository
public class DinerRepository {
    public Iterator<MenuItem> getTheMenu() {
        DinerMenu dinerMenu = new DinerMenu();
        return dinerMenu.createIterator();
    }
}
