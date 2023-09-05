// 
// Decompiled by Procyon v0.5.36
// 

package ija.ija2020.homework1.goods;

public interface GoodsShelf
{
    void put(final GoodsItem p0);
    
    boolean containsGoods(final Goods p0);
    
    GoodsItem removeAny(final Goods p0);
    
    int size(final Goods p0);
    
    int getNumber();
    
    void printShelf();

    String obsah();
}
