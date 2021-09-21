/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

public class BigSize extends OrderDecorator{
    
<<<<<<< HEAD
    private double PERCENTAGE = 1.35;
=======
    private double PERCENTAGE = 0.35;
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
    
    public BigSize(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return super.calculate() * PERCENTAGE;  }
<<<<<<< HEAD
=======
    
    
    
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
}
