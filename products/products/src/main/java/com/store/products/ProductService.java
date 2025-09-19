package com.store.products;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

@Component
public class ProductService {
    HashMap<Integer, Products> hm=new HashMap<>();

    public ProductService() {
    }

    public void addProduct(Products products) {
        hm.put(products.getId(), products);
    }



    public ArrayList<Double> getProductsByPrice(){
        ArrayList<Double> arrp = new ArrayList<>();
        TreeSet<Double> ts = new TreeSet<>();
        for(int i:hm.keySet()){
            ts.add(hm.get(i).getPrice());
        }
        for(double j:ts){
            arrp.add(j);
        }

        return arrp;
    }

    public ArrayList<Products> getProductsByName() {
        ArrayList<Products> arr = new ArrayList<>(hm.values());
        Collections.sort(arr,(s1,s2)->
            s1.getName().compareTo(s2.getName())
        );
        return arr;

    }
}
