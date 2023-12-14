package JavaPlay;

import JavaPlay.controller.ControllerAdd;
import JavaPlay.controller.ControllerPlay;
import JavaPlay.controller.SlotMachine;
import JavaPlay.data.AToy;
import JavaPlay.history.History;
import JavaPlay.menu.Menu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AToy aToy = new AToy(1,"Mishka",5,1);//Создание игрушки
        AToy aToy2 = new AToy(2,"Wolf",5,1);
        AToy aToy3 = new AToy(3,"Tiger",5,1);
        AToy aToy4 = new AToy(4,"Fox",5,1);
        aToy.setFrequencyofloss(50);//Изменение шанса вероятности
        aToy2.setFrequencyofloss(50);
        aToy3.setFrequencyofloss(50);
        aToy4.setFrequencyofloss(50);
        ControllerAdd controllerAdd = new ControllerAdd(aToy,10);//Добавить +10
        ArrayList arrayList = new ArrayList(List.of(aToy, aToy2, aToy3, aToy4));//Добавляем все игрушки в лист
        LinkedList <String> linkedList = new LinkedList();//Создаем список выиграша
        Menu menu = new Menu(arrayList,linkedList);//Запускаем процесс
    }
}
