package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    private List<MenuItem> items;

    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("Cannot remove an item");
        }
        if (items.get(position - 1) != null) {
            for (int i = position - 1; i < (items.size() - 1); i++) {
                items.set(i, items.get(i + 1));
            }
            items.set(items.size() - 1, null);
        }
    }

}
