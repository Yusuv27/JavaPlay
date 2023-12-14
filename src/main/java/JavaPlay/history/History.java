package JavaPlay.history;

import java.io.*;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class History {
    public History(LinkedList linkedList){
        try {
            String name = (String) linkedList.removeFirst();
            System.out.println("Игрушка "+name+" перемешена в текстовый файл");
            File MyFile= new File("Text");
            try (PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(MyFile,true)))) {
                write.println(name);
            } catch (IOException e) {
                System.out.println("Ошибка!");
            }
        }catch (NoSuchElementException e){
            System.out.println("В списке выиграша ничего нет;(");
        }
    }
}
