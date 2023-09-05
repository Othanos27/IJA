/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;
import Order.IOrder;
import Order.Order;
import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsShelf;
import ija.ija2020.homework1.store.StoreGoods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jirka
 */

public class WarehouseMap implements IWarehouseMap {
  
    private ArrayList<GoodsShelf> shelfs;
    
    public WarehouseMap(){
           this.shelfs = new ArrayList<>();
    }

    public ArrayList<GoodsShelf> getList() {
        return this.shelfs;
    }

    @Override
    public void addShelf(GoodsShelf shelf) {
        this.shelfs.add(shelf);
    }

    @Override
    public void removeShelf(GoodsShelf shelf) {
        this.shelfs.remove(shelf);
    }
    
    @Override
    public void printList(){
        System.out.println("VYPIS ZBOZI VE SKLADE: ");
        for(GoodsShelf shelf : shelfs){
            shelf.printShelf();
            System.out.println("");
        }
        
       System.out.println("------------------------");

    }
    
    /*Vime ze mame potrebne zbozi, nemusime to kontrolovat*/

    public void put(Map<Integer, List<Order>> map, Integer index, Order order){
        if(map.containsKey(index)){
            map.get(index).add(order);
        } else {
            final List<Order> list = new ArrayList<>();
            list.add(order);
            map.put(index, list);
        }
    }

    @Override
    public Map<Integer, List<Order>> getPath(ArrayList<Order> orders){
        
        Map<Integer, List<Order>> map = new HashMap<>();
        
        /*prochazim objednavky postupne a zaznamenam si */
        
        for(IOrder o : orders){
            Goods good = new StoreGoods(o.getName());
            int count = o.getCount();
            
            for(GoodsShelf s : this.shelfs){
                if(s.containsGoods(good)){
                    if(count < s.size(good)){
                        put(map, s.getNumber(), new Order(o.getName(), count));
                        break;
                    } else {
                        /*Pokud celkova velikost je vetsi, musim to rozdelit do vice regalu*/
                        put(map, s.getNumber(), new Order(o.getName(), s.size(good)));
                        count -= s.size(good);
                    }
                }
            }
        }

        return map;
    }

    @Override
    public boolean executeOrder(ArrayList<Order> orders){
        
        for(IOrder o : orders){
            int count = 0;    
            Goods good = new StoreGoods(o.getName());
           
            for(GoodsShelf s : this.shelfs){
                if(s.containsGoods(good)){
                    count += s.size(good);
                }    
            }
            
            if(o.getCount() > count){
                System.out.println("Pocet " + o.getName() + " neni skladem.\nPozadovane: " + o.getCount() + "\nDostupne: " +count);
                return false;
            }
        }
        

        
        return true;
    }

    

}
