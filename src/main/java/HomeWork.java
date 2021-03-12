import java.io.*;

public class HomeWork {

    public static void main(String[] args) {
        String[] header = {"box1", "box2", "box3"};
        int[][] data = {{100, 200, 300}, {150, 250, 350}};
        readArrayToFile();
    }

    private static void readArrayToFile() {
        try (Reader reader = new FileReader("src/main/resources/box.csv")) {
            BufferedReader buffReader = new BufferedReader(reader);

            while (buffReader.ready()) {
                System.out.println(buffReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
