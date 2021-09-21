/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities.additional;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

<<<<<<< HEAD
<<<<<<<< HEAD:src/main/java/br/com/unipar/entities/additional/Cookie.java
=======
/**
 *
 * @author phtar
 */
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
public class Cookie extends OrderDecorator{
    
    private double VALUE = 0.90;

    public Cookie(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
}
<<<<<<< HEAD
========
/**
 *
 * @author phtar
 */
//public class NormalSize extends OrderDecorator{
//    
//    public NormalSize(Order order) {
//        super(order);
//    }
//
//    @Override
//    public double calculate() {
//        return super.calculate(); 
//    
//    }
//    
//    
//    
//}
>>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9:src/main/java/br/com/unipar/entities/NormalSize.java
=======
>>>>>>> b13ea35831e6c8b73ae96ca446f47eb76b7600c9
