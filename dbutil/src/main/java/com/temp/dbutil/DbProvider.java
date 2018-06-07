package com.temp.dbutil;

import java.util.ArrayList;
import java.util.List;

public class DbProvider {


    public List<Items> getItems()
    {
        ArrayList<Items> items = new ArrayList();
        items.add(new Items("One"));
        items.add(new Items("Two"));
        items.add(new Items("Three"));
        return items;
    }
}
