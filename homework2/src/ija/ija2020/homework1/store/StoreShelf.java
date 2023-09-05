package ija.ija2020.homework1.store;


import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import ija.ija2020.homework1.goods.GoodsShelf;
import ija.ija2020.homework1.goods.GoodsShelf;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jirka
 */

public class StoreShelf implements GoodsShelf{
    
    private Map<Goods, List<GoodsItem>> map;
    
    private int number;
    
    public StoreShelf(int number){
        this.map = new HashMap<>();
        this.number = number;
    }
    
    public StoreShelf(){
        this.map = new HashMap<>();
    }
    
    @Override
    public int getNumber(){
        return this.number;
    }
    
    @Override
    public void put(GoodsItem p0){
        final Goods goods = p0.goods();
        
        if (this.map.containsKey(goods)) {
            this.map.get(goods).add(p0);
        }else {
            final List<GoodsItem> lst = new ArrayList<>();
            lst.add(p0);
            this.map.put(goods, lst);
        }
    }
    
    @Override
    public void printShelf(){
        System.out.println("Z REGALU: " + this.number);
        
        for(Map.Entry<Goods, List<GoodsItem>> entry : map.entrySet()){
            System.out.println(entry.getKey().getName() + " " + size(entry.getKey()));
        }
        
    }

    @Override
    public String obsah() {
        String ret = "";

        Map.Entry entry;
        for(Iterator var2 = this.map.entrySet().iterator(); var2.hasNext(); ret = ret + ((Goods)entry.getKey()).getName() + " " + this.size((Goods)entry.getKey()) + "x ") {
            entry = (Map.Entry)var2.next();
        }

        return ret;
    }

    @Override
    public boolean containsGoods(Goods p0) {
        final List<GoodsItem> lst = this.map.get(p0);

        return lst != null && !lst.isEmpty();
    }

    @Override
    public GoodsItem removeAny(Goods p0) {
        final List<GoodsItem> lst = this.map.get(p0);
        if (lst == null || lst.isEmpty()) {
            return null;
        }
        
        return lst.remove(0);
    }

    @Override
    public int size(Goods p0) {
        final List<GoodsItem> lst = this.map.get(p0);
        if(lst == null){
            return 0;
        }
        return lst.size();
    }
    
}
