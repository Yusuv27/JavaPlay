package JavaPlay.controller;

import JavaPlay.data.AToy;

public class ControllerAdd {
    public ControllerAdd(AToy aToy, Integer quantity){
        Integer quantity2 = aToy.getQuantity();
        quantity=quantity2+quantity;
        aToy.setQuantity(quantity);
    }
}
