package ija.ija2020.homework1.store;


import ija.ija2020.homework1.store.StoreGoodsItem;
import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jirka
 */
public class StoreGoods implements Goods {

    private String name;
    private ArrayList<GoodsItem> items;
    
    public StoreGoods(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean addItem(GoodsItem p0) {
        try{
            this.items.add(p0);
        } catch(IndexOutOfBoundsException e){
            return false;
        }
        return true;
    }

    @Override
    public GoodsItem newItem(LocalDate p0) {
        final StoreGoodsItem item = new StoreGoodsItem(this, p0);
        addItem(item);
        return  item;
    }

    @Override
    public boolean remove(GoodsItem p0) {
          try{
            this.items.remove(p0);
        } catch(IndexOutOfBoundsException e){
            return false;
        }
        return true;
    }

    @Override
    public boolean empty() {
        if(this.items.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return this.items.size();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StoreGoods other = (StoreGoods) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
