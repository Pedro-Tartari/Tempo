/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;
<<<<<<< HEAD

public class CoffeMilk implements Order{
    
    private double VALUE = 1.75;

    @Override
    public double calculate() {
        return VALUE;
=======
import br.com.unipar.controller.OrderDecorator;

/**
 *
 * @author phtar
 */
public class CoffeMilk extends OrderDecorator{
    
    private double VALUE = 1.75;

    public CoffeMilk(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
    }
}
