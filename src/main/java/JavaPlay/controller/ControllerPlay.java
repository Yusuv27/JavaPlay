package JavaPlay.controller;

import JavaPlay.data.AToy;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Random;

public class ControllerPlay {
    public ControllerPlay(AToy aToy, LinkedList linkedList){
        try{
            String name = aToy.getName();
            Integer randomNumber;
            Integer number = 100/aToy.getFrequencyofloss();
            if(number!=1) {
                Random random = new Random();
                randomNumber = random.nextInt(number);
            }else {
                randomNumber = 1;
            }
            if (randomNumber==1){
                if(aToy.getQuantity()!=0) {
                    Integer num = aToy.getQuantity();
                    aToy.setQuantity(num - 1);
                    num-=1;
                    System.out.println("\u001B[32mВы выиграли игрушку " + name + "!Их осталось: "+num+"\u001B[0m");
                    linkedList.add(name);
                }else {
                    System.out.println("\u001B[31mВыпала бы игрушка "+name+" но они закончились ;(\u001B[0m");
                }
            }else {
                System.out.println("\u001B[31mВы не выиграли игрушку :(\u001B[0m");
            }
        }catch (ArithmeticException e){
             System.out.println("Невозможно выбить данную игрушку");
         }
    }
}
