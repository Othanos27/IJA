package ija.ija2020.homework1.store;


import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import ija.ija2020.homework1.goods.GoodsItem;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jirka
 */
public class StoreGoodsItem implements GoodsItem {

    private Goods goods1;
    private LocalDate of;
    
    public StoreGoodsItem(Goods goods1, LocalDate of) {
        this.goods1 = goods1;
        this.of = of;
    }


    @Override
    public Goods goods() {
        return this.goods1;
    }

    @Override
    public boolean sell() {
        return goods1.remove(this);
    }
    
}
