/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.runner;

import br.com.unipar.controller.Order;
import br.com.unipar.entities.*;


/**
 *
 * @author phtar
 */
public class main {
    public static void main(String[] args) {
        
        
        Order teste = new MediumSize(new Coffe(new BasicOrder()));
        
        System.out.println(teste.calculate());
        
    }
}
