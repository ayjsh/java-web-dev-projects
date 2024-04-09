package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class menu {
    private ArrayList<menuItem> menuItems = new ArrayList<>();;
    private LocalDate lastUpdated;
    //Allow for default constructor

    public ArrayList<menuItem> getMenuItems() {
        return menuItems;
    }
}