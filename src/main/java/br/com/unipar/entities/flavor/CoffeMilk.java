/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;

public class CoffeMilk implements Order{
    
    private double VALUE = 1.75;

    @Override
    public double calculate() {
        return VALUE;
    }
}
