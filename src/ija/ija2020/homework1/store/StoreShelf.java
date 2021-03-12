package ija.ija2020.homework1.store;

import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import ija.ija2020.homework1.goods.GoodsShelf;

import java.util.ArrayList;

public class StoreShelf implements GoodsShelf {

    private ArrayList<GoodsItem> items = new ArrayList<GoodsItem>();

    @Override
    public boolean containsGoods(Goods goods) {
        for (GoodsItem item : items) {
            Goods itemGoods = item.goods();
            String name1 = itemGoods.getName();
            String name2 = goods.getName();
            if (name1 == name1) return true;
        }
        return false;
    }
    @Override
    public void put(GoodsItem item) {
        items.add(item);
    }
    @Override
    public GoodsItem removeAny(Goods goods) {
        GoodsItem r = null;
        for (GoodsItem item : items) {
            if (item.goods().getName().equals(goods.getName())) {
                r = item;
            }
        }
        return r;
    }
    @Override
    public int size(Goods goods) {
        int s = 0;
        for (GoodsItem item : items) {
            if (item.goods().getName().equals(goods.getName())) {
                s++;
            }
        }
        return s;
    }

    public StoreShelf(){

    }
}
