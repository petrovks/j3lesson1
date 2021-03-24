package geekbrains.j3lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Box<Apple> box = new Box<>(apple);
        box.addFruit(apple1);
        box.addFruit(apple2);
        Orange o = new Orange();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Box<Orange> box1 = new Box<>(o);
        box1.addFruit(o1);
        System.out.println(box.compareByWeight(box1));
        System.out.println(box.getWeight());
        System.out.println(box1.getWeight());
        Box<Apple> a = new Box<>(new Apple());
        System.out.println(a.getWeight());
        box.sortingFruit(a);
        System.out.println(box.getWeight());
        System.out.println(a.getWeight());
    }
// i - номер ячейки в которую переносим значение
    //j - номер ячейки из которой переносим
    public <T> void changeArrPosition(int i, int j, T... temp) {
        T t = temp[i];
        temp[i] = temp[j];
        temp[j] = t;
    }

    public <T> ArrayList<T> conversion(T... temp) {
        ArrayList<T> list = new ArrayList<T>();
        for (T t: temp) {
            list.add(t);
        }
        return list;
    }

}
