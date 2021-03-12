package homeWorh2;

import org.junit.Test;

import java.io.*;

public class HomeWorkWrite {

    public static void main(String[] args) {
        String[] header = {"box1", "box2", "box3"};
        int[][] data = {{100, 200, 300}, {150, 250, 350}};

        saveArrayToFile(header, data, "src/main/resources/box.csv");
        readArrayToFile();
    }

    private static void saveArrayToFile(String[] header, int[][] data, String name) {
        try {
            BufferedWriter dataWrite = new BufferedWriter(new FileWriter(name));
            for (int i = 0; i < header.length; i++) {
                dataWrite.write(String.valueOf(header[i]));
                dataWrite.append("; ");
            }

            for (int i = 0; i < data.length; i++) {
                dataWrite.newLine();
                for (int j = 0; j < data[0].length; j++) {
                    dataWrite.write(String.valueOf(data[i][j]));
                    dataWrite.append("; ");
                }
            }
            dataWrite.flush();
            dataWrite.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
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