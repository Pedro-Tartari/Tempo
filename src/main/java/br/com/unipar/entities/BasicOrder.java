/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities;

import br.com.unipar.controller.Order;

/**
 *
 * @author phtar
 */
public class BasicOrder implements Order{

    private double totalValue;
    
    @Override
    public double calculate() {
        return totalValue=0;
    }
    
    
    
    
}
