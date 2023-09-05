/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import Order.IOrder;
import Order.Order;
import ija.ija2020.homework1.goods.GoodsShelf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jirka
 */
public interface IWarehouseMap {
    
    void addShelf(final GoodsShelf shelf);
    
    void removeShelf(final GoodsShelf shelf);
    
    Map<Integer, List<Order>> getPath(ArrayList<Order> orders);
    
    void put(Map<Integer, List<Order>> map, Integer index, Order order);
    
    void printList();
    
    boolean executeOrder(ArrayList<Order> orders);
    
    
}
