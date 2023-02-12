/*Разработать программу, имитирующую поведение коллекции
HashSet. В программе содать метод add добавляющий элемент,
 и метод позволяющий выводить эллементы коллекции в консоль.
 Формат данных Integer. */

import java.util.HashMap;

public class Main {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args)  {
        add(25);
        add(3);
        add(57);
        add(23);
        add(10);
        add(98);
        add(17);
        System.out.println(getStr());
    }


    public static String getStr() {
        return hMap.keySet().toString();
    }
    public static void add(Integer numbers) {
        hMap.put(numbers, OBJECT);

    }
}