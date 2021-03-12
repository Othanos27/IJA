package ija.ija2020.homework1.store;

import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;

import java.time.LocalDate;

public class StoreGoodsItem implements GoodsItem {

    private Goods name;
    private LocalDate date;

    @Override
    public Goods goods() {
        return name;
    }
    @Override
    public boolean sell() {
        Goods goods = this.goods();
        boolean r = goods.remove(this);
        goods.remove(this);
        return r;
    }

    public StoreGoodsItem (Goods goods, LocalDate date) {
        name = goods;
        this.date = date;
    }

}
