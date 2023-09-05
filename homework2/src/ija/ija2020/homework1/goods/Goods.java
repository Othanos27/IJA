

package ija.ija2020.homework1.goods;

import java.time.LocalDate;

public interface Goods
{
    String getName();
    
    boolean addItem(final GoodsItem p0);
    
    GoodsItem newItem(final LocalDate p0);
    
    boolean remove(final GoodsItem p0);
    
    boolean empty();
    
    int size();
}
