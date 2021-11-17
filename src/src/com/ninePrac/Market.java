package com.ninePrac;

import java.util.HashMap;
import java.util.Map;


public class Market {
    protected final HashMap<String,Integer> db= new HashMap<>();

    public Market() {
        for (int i = 0; i < 10; i++) {
            StringBuilder db = new StringBuilder();

            for (int n = 0; n < 10; n++) {
                db.append(Math.random());
            }
            this.Print();
        }
    }
    public void Print() {
        this.db.forEach((name, number) -> System.out.println("\t Name Client " + name + ", ID" + number + ""));
    }

    public void checkDB(String name, int id) throws MarketException{
        boolean contains = this.db.containsKey(name);
        if(!contains) throw new NoClientException(name);

        long getID = this.db.get(name);
        if (getID != id) throw new NoNumberException(id);
    }
}
