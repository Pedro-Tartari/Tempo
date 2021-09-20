/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.runner;

import br.com.unipar.entities.flavor.*;
import br.com.unipar.controller.Order;
import br.com.unipar.entities.*;
import br.com.unipar.entities.additional.*;


/**
 *
 * @author phtar
 */
public class main {
    public static void main(String[] args) {
        
        /*Flavor
            Coffe - CoffeMilk - ChocoMilk - Mocha - EspressPanna
        */
        
        /*Size
            MediumSize - BigSize
        */
        
        Order teste =new CondensedMilk(new Cookie(new BigSize(new Coffe(new BasicOrder()))));
        
        System.out.println(teste.calculate());
        
    }
}
