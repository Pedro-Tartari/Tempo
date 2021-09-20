/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.controller;

/**
 *
 * @author phtar
 */
public class OrderDecorator implements Order{

    private Order order;
    
    //Ele vai receber o BasicOrder e salvar na propriedade a cima
    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double calculate() {
        return order.calculate();
     }
    
   
    
}
