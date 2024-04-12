package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class menu {
    private ArrayList<menuItem> menuItems = new ArrayList<>();;
    private LocalDate lastUpdated;
    //Allow for default constructor
    public void addItem(MenuItem item) {
        for (MenuItem food : this.menuList) {
            if (food.getName() == item.getName()) {
                System.out.println(item.getName() + " is already on the menu!");
                return;
            }
        }
        System.out.println("adding " + item.getName() + " to the menu");
        this.menuList.add(item);
        this.date = setDate();
    }

    public void removeItem(MenuItem item) {
        System.out.println("removing " + item.getName() + " to the menu");
        this.menuList.remove(this.menuList.indexOf(item));
    }

    public ArrayList<menuItem> getMenuItems() {
        return menuItems;
    }

    private String setDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public void setNewOld(String aNewOld) {
        this.newOld = aNewOld;
    }
    public void setNew() {
        int length = this.menuList.size();
        this.menuList.get(length - 1).setNewOld("New");
    }

    public Boolean equals(MenuItem item) {
        if (this.name == item.name) ;
        return true;
    }
}