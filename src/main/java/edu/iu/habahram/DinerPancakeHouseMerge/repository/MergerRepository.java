package edu.iu.habahram.DinerPancakeHouseMerge.repository;
import edu.iu.habahram.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Repository
public class MergerRepository {
    public List<MenuItemRecord> getTheMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
        MenuItem[] menuItems = allMenus.getItems();
        List<MenuItemRecord> records = Arrays.stream(menuItems)
                .map(x -> new MenuItemRecord(x.getName(),
                        x.getDescription(),
                        x.isVegetarian(),
                        x.getPrice())).toList();
        return records;
    }

    public List<MenuItemRecord> getVegetarianMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));

        CompositeIterator iterator = new CompositeIterator(allMenus.createIterator());

        List<MenuItemRecord> records = new ArrayList<>();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            for (MenuItem menuItem : menuComponent.getItems()) {
                if (menuItem.isVegetarian()) {
                    records.add(new MenuItemRecord(menuItem.getName(), menuItem.getDescription(), menuItem.isVegetarian(), menuItem.getPrice()));
                }
            }
        }
        return records;

    }


    public List<MenuItemRecord> getBreakfastMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));

        CompositeIterator iterator = new CompositeIterator(allMenus.createIterator());

        List<MenuItemRecord> records = new ArrayList<>();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent.getDescription().equals("Breakfast")){
                MenuItem[] menuItems = menuComponent.getItems();
                for (MenuItem menuItem : menuItems) {
                    records.add(new MenuItemRecord(menuItem.getName(), menuItem.getDescription(), menuItem.isVegetarian(), menuItem.getPrice()));
                }
            }
        }

        return records;
    }

    public List<MenuItemRecord> getLunchMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));

        CompositeIterator iterator = new CompositeIterator(allMenus.createIterator());

        List<MenuItemRecord> records = new ArrayList<>();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent.getDescription().equals("Lunch")){
                MenuItem[] menuItems = menuComponent.getItems();
                for (MenuItem menuItem : menuItems) {
                    records.add(new MenuItemRecord(menuItem.getName(), menuItem.getDescription(), menuItem.isVegetarian(), menuItem.getPrice()));
                }
            }
        }

        return records;
    }

    public List<MenuItemRecord> getDinnerMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));

        CompositeIterator iterator = new CompositeIterator(allMenus.createIterator());

        List<MenuItemRecord> records = new ArrayList<>();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent.getDescription().equals("Dinner")){
                MenuItem[] menuItems = menuComponent.getItems();
                for (MenuItem menuItem : menuItems) {
                    records.add(new MenuItemRecord(menuItem.getName(), menuItem.getDescription(), menuItem.isVegetarian(), menuItem.getPrice()));
                }
            }
        }

        return records;
    }
}
