public class Main {

    public static void main(String[] args) {
        Apple ap = new Apple();
        Orange or = new Orange();

        Box appleBox1 = new Box();
        Box appleBox2 = new Box();
        Box orangeBox = new Box();

        appleBox1.add(ap);

        appleBox2.add(ap);
        appleBox2.add(ap);
        appleBox2.add(ap);

        orangeBox.add(or);
        orangeBox.add(or);

        System.out.println("--- Current boxes ---");
        appleBox1.print();
        appleBox2.print();
        orangeBox.print();

        System.out.println("--- Current boxes weight ---");
        printWeight(appleBox1);
        printWeight(appleBox2);
        printWeight(orangeBox);

        System.out.println("--- Compare boxes ---");
        compareBoxes(appleBox1, orangeBox);
        compareBoxes(appleBox2, orangeBox);

        Box newBox = new Box();

        System.out.println("--- Before move ---");
        appleBox2.print();
        newBox.print();

        move(appleBox2, newBox);

        System.out.println("--- After move ---");
        appleBox2.print();
        newBox.print();

        System.out.println("--- Failed move ---");
        move(appleBox1, orangeBox);
    }

    private static void move(Box from, Box to) {
        boolean result = from.moveTo(to);
        System.out.println("Move " + (result ? "success" : "failed"));
    }

    private static void printWeight(Box box) {
        System.out.println(box.getFruitsType() + " box weight = " + box.getWeight());
    }

    private static void compareBoxes(Box box1, Box box2) {
        String result = box1.compare(box2) ? "equals" : "not equals";
        System.out.println(box1.getFruitsType() + " box and " + box2.getFruitsType() + " box are " + result);
    }
}
