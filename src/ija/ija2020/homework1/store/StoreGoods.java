package ija.ija2020.homework1.store;

import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;

import java.time.LocalDate;
import java.util.ArrayList;

public class StoreGoods implements Goods{

    private String name;
    private ArrayList<GoodsItem> items = new ArrayList<GoodsItem>();
    private int size;

    @Override
    public boolean addItem(GoodsItem item) {
        items.add(item);
        size++;
        return true;
    }
    @Override
    public boolean empty() {
        return (items.size() == 0);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public GoodsItem newItem(LocalDate loaded) {
        GoodsItem itm = new StoreGoodsItem(this, loaded);
        addItem(itm);
        return itm;
    }
    @Override
    public boolean remove(GoodsItem item) {
        boolean r = items.remove(item);
        items.remove(item);
        size--;
        return (r);
    }
    @Override
    public int size() {
        return size;
    }

    public StoreGoods (String name){
        this.name = name;
    }


}
