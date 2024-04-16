package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {
        //create menu items
        MenuItem tacosBeef = new MenuItem("Beef Tacos", 2.49, "3 Beef Tacos", "Entree", "New");
        MenuItem tacosChicken = new MenuItem("Chicken Tacos", 2.79, "3 Chicken Tacos", "Entree", "");
        MenuItem tacosFish = new MenuItem("Fish Tacos", 2.99, "3 Fish Tacos", "Entree", "");
        MenuItem rice = new MenuItem("Rice", 1.49, "Side of Rice", "Appetizers", "New");
        MenuItem friedIceCream = new MenuItem("Fried Vanilla Ice Cream", 3.49, "Classic Fried Ice Cream", "Dessert", "");
        MenuItem churros = new MenuItem("2 Churros", 2.79, "2 Hot Fresh Churros", "Dessert", "");

        // Create a menu with the Menu Class
        Menu menu = new Menu();

        // add items to an ArrayList in the Menu Class
        menu.addItem(tacosBeef);
        menu.addItem(tacosChicken);
        menu.addItem(tacosFish);
        menu.addItem(rice);
        menu.addItem(friedIceCream);
        menu.addItem(churros);

        //remove an item
        menu.removeItem(tacos);
        System.out.println("\r");

        //set the last item added as New
        menu.setNew();

        // Check when the menu was last updated
        System.out.println("Menu Updated on " + Menu.date + "\n");

        // Print the menu
        for (MenuItem item : menu.getMenuList()) {
            System.out.println(item);
            //System.out.println(item.getName());
        }

        //Print a single item using toString
        System.out.println("\r");
        System.out.println("Printing a single Menu Item");
        System.out.println(tacos.toString());