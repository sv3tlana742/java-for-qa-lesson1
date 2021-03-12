import org.example.App;

import java.util.ArrayList;

public class Box {

    private ArrayList<Fruit> list;
    protected String fruitsType;

    public Box() {
        list = new ArrayList<>();
        fruitsType = "";
    }

    public boolean moveTo (Box box) {
        for (Fruit fruit : list) {
            if (!box.add(fruit)) {
                return false;
            }
        }

        list = new ArrayList<>();
        fruitsType = "";

        return true;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public float getWeight() {
        float weight = 0;

        for (Fruit fruit : list) {
            weight += fruit.getWeight();
        }

        return weight;
    }

    public String getFruitsType() {
        return fruitsType;
    }

    public boolean add (Fruit fruit) {
        String type = fruit.getClass().getName();

        if (fruitsType.equals("")) {
            fruitsType = type;
        }

        if (!fruitsType.equals(type)) {
            System.out.println("Cannot add " + type + " to " + fruitsType + " box");
            return false;
        }

        list.add(fruit);

        return true;
    }

    public void print() {
        System.out.println(list);
    }
}
