package JavaPlay.menu;

import JavaPlay.controller.SlotMachine;
import JavaPlay.data.AToy;
import JavaPlay.history.History;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    public Menu(ArrayList arrayList, LinkedList linkedList){
        System.out.println("1.Прокрутить\n2.Посмотреть выигрыш\n3.Забрать игрушку из выиграша");
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.equals("1")){
            try {
                    System.out.println("Сколько сделать прокруток?");
                    scanner = new Scanner(System.in);
                    str = scanner.nextLine();
                    Integer integer = Integer.parseInt(str);
                    if(integer>0){
                        for (int i = 0; i < integer; i++) {
                            SlotMachine slotMachine = new SlotMachine(arrayList, linkedList);
                        }
                        Menu menu = new Menu(arrayList,linkedList);
                    }else {
                        System.out.println("ЧИСЛО ПРОКРУТОК НЕ МОЖЕТ БЫТЬ ОТРИЦАТЕЛЬНЫМ!");
                        Menu menu = new Menu(arrayList,linkedList);
                    }
            }catch (NumberFormatException e){
                System.out.println("НЕКОРРЕКТНО ВВЕДЕНЫ ДАННЫЕ!");
                Menu menu = new Menu(arrayList,linkedList);
            }
        } else if (str.equals("2")) {
            System.out.println(linkedList);
            Menu menu = new Menu(arrayList,linkedList);
        } else if (str.equals("3")) {
            History history = new History(linkedList);
            Menu menu = new Menu(arrayList,linkedList);
        }else {
            System.out.println("Введена неизвестная команда!");
            Menu menu = new Menu(arrayList,linkedList);
        }
    }
}
