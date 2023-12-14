package JavaPlay.controller;

import JavaPlay.data.AToy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Random;

public class SlotMachine {
    protected Integer number1;
    public SlotMachine(ArrayList arrayList, LinkedList linkedList){
        Integer number = arrayList.size();
        Random random = new Random();
        int randomNumber = random.nextInt(number);
        ControllerPlay controllerPlay =  new ControllerPlay((AToy) arrayList.get(randomNumber),linkedList);

    }
}
