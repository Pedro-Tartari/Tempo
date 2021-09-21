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

public class main {
    public static void main(String[] args) {
        
        /*Flavor
            Coffe - CoffeMilk - ChocoMilk - Mocha - EspressPanna
        */
<<<<<<< HEAD
        
        /*Size
            MediumSize - BigSize
        */
        
        /*
         A ordem de print é da esquerda para Direita, 
        para dar o valor mais correto o ideal é ser o flavor mais a direita
        seguido pelo tamanho e depois adicionais
        */
        
        Order teste =  new CondensedMilk (new Cookie(new BigSize(new Coffe ())));
=======
        
        /*Size
            MediumSize - BigSize
        */
        
        Order teste =new CondensedMilk(new Cookie(new BigSize(new Coffe(new BasicOrder()))));
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
        
        System.out.println("O valor total é de: " + teste.calculate());
        
    }
}
