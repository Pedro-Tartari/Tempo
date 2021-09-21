/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.controller;

<<<<<<< HEAD
public class OrderDecorator implements Order {
=======
/**
 *
 * @author phtar
 */
public class OrderDecorator implements Order{
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9

    private Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double calculate() {
        return order.calculate();
    }
}
