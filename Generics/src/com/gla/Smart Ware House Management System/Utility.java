package com.gla.SmartWarehouseManegementSystem;

import java.util.List;

class Utility {
    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.name);
        }
    }
}
