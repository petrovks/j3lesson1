package geekbrains.j3lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    ArrayList<T> list;
    private T obj;
    private float weight;

    public Box(T obj) {
        this.obj = obj;
        list = new ArrayList<>();
        list.add(obj);
    }

    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public boolean compareByWeight(Box<?> t) {
        return Math.abs(this.weight - t.weight) < 0.01 ;
    }

    public float getWeight() {
        if (list.isEmpty()) return 0.0f;
        else return list.size() * obj.getWeight();
    }

    public void sortingFruit(Box<T> t) {
      if (!list.isEmpty()) {
          for (int i = list.size()-1; i >= 0; i--) {
              t.addFruit(list.get(i));
              list.remove(i);
          }
      }
    }
}
