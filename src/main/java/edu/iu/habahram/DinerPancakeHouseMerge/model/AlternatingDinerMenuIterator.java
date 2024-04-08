/**
TASK OF GROUP-WORK 5:
For this part, use the brach "part4".

The Chefs have decided that they want to be able to alternate their lunch menu items; in other words, they will offer some
items on Monday, Wednesday, Friday, and Sunday, and other items on Tuesday, Thursday, and Saturday.

Add a class, called "AlternatingDinerMenuIterator" to the model package that alternates the menu items.
Here is the  (incomplete) code for the class: 
https://gist.github.com/hbahramian/b3ae74f8c0ce823beef0195af6d3017a Links to an external site.

Complete the missing implementations. 

Hint: The following code gets the day of the week:

Calendar date = Calendar.getInstance();
int day_of_week = date.get (Calendar.DAY_OF_WEEK);
Submit the url of your github repository (branch "part4").
**/


package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar date = Calendar.getInstance();
        int day_of_week = date.get (Calendar.DAY_OF_WEEK);
        position = day_of_week % 2;
    }
    public MenuItem next() {
        MenuItem menuItem = items[position];
        Calendar date = Calendar.getInstance();
        int day_of_week = date.get (Calendar.DAY_OF_WEEK);
        position = day_of_week + 2;

        return menuItem;
    }
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
