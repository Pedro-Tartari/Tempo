/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities.additional;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

public class Cookie extends OrderDecorator{
    
    private double VALUE = 0.90;

    public Cookie(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
}
