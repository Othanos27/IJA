/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author Jirka
 */
public class Order implements IOrder{

    private String name;
    private int count;
    
    public Order(String name, int count){
        this.name = name;
        this.count = count;
    }

    @Override
    public String getName() {
            return this.name;
    }

    @Override
    public int getCount() {
           return this.count;
    }
    
}
