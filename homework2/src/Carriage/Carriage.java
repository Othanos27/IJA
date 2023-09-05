/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carriage;

import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import ija.ija2020.homework1.goods.GoodsShelf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jirka
 */

public class Carriage {
    private int capacity;
    private boolean busy;
    private GoodsShelf shelf;

    public Carriage(int capacity, boolean busy){
        this.capacity = capacity;
        this.busy = busy;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public boolean isBusy(){
        return this.busy;
    }
    
    public void loadCarriage(String name, int count){
        
    }
            
    public void setBusy(boolean busy){
        this.busy = busy;
    }
    
    
}
