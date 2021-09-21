/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;
<<<<<<< HEAD

public class EspressPanna implements Order{
    
    private double VALUE = 4.50;

    @Override
    public double calculate() {
        return VALUE;
=======
import br.com.unipar.controller.OrderDecorator;

/**
 *
 * @author phtar
 */
public class EspressPanna extends OrderDecorator{
    
    private double VALUE = 4.50;

    public EspressPanna(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
    }
}
