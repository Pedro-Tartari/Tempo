/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities.additional;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

/**
 *
 * @author phtar
 */
public class CondensedMilk extends OrderDecorator{
    
    private double VALUE = 1.85;

    public CondensedMilk(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
}
