/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities.additional;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

<<<<<<< HEAD
=======
/**
 *
 * @author phtar
 */
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
public class NestMilk extends OrderDecorator{
    
    private double VALUE = 1.40;

    public NestMilk(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
}
