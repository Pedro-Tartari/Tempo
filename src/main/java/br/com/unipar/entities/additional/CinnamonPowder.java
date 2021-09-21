/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/br/com/unipar/entities/additional/CinnamonPowder.java
package br.com.unipar.entities.additional;
=======
package br.com.unipar.entities.flavor;
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9:src/main/java/br/com/unipar/entities/flavor/Coffe.java
=======
package br.com.unipar.entities.additional;
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/br/com/unipar/entities/additional/CinnamonPowder.java
public class CinnamonPowder extends OrderDecorator{
    
    private double VALUE = 0.75;

    public CinnamonPowder(Order Order) {
=======
=======
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
/**
 *
 * @author phtar
 */
<<<<<<< HEAD
public class Coffe extends OrderDecorator {

    private double VALUE = 1.50;

    public Coffe(Order Order) {
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9:src/main/java/br/com/unipar/entities/flavor/Coffe.java
=======
public class CinnamonPowder extends OrderDecorator{
    
    private double VALUE = 0.75;

    public CinnamonPowder(Order Order) {
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/br/com/unipar/entities/additional/CinnamonPowder.java
=======

>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9:src/main/java/br/com/unipar/entities/flavor/Coffe.java
=======
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
}
