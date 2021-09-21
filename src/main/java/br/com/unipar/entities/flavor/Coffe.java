/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;

public class Coffe implements Order {

    private double VALUE = 1.50;


    @Override
    public double calculate() {
        return VALUE;
    }

=======
<<<<<<< HEAD:src/main/java/br/com/unipar/entities/additional/CinnamonPowder.java
package br.com.unipar.entities.additional;
=======
package br.com.unipar.entities.flavor;
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9:src/main/java/br/com/unipar/entities/flavor/Coffe.java

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

<<<<<<< HEAD:src/main/java/br/com/unipar/entities/additional/CinnamonPowder.java
public class CinnamonPowder extends OrderDecorator{
    
    private double VALUE = 0.75;

    public CinnamonPowder(Order Order) {
=======
/**
 *
 * @author phtar
 */
public class Coffe extends OrderDecorator {

    private double VALUE = 1.50;

    public Coffe(Order Order) {
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9:src/main/java/br/com/unipar/entities/flavor/Coffe.java
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
<<<<<<< HEAD:src/main/java/br/com/unipar/entities/additional/CinnamonPowder.java
=======

>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9:src/main/java/br/com/unipar/entities/flavor/Coffe.java
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
}
