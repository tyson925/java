import com.company.javapractice.Merchandise.DairyProduct;
import com.company.javapractice.Merchandise.Fruit;
import com.company.javapractice.Merchandise.StoreHouse.BadQuality;

import java.io.*;
import java.util.ArrayList;

public class Inventory {
    int productCount;
    static ArrayList<DairyProduct> dairyList = new ArrayList<>();
    static ArrayList<Fruit> fruitList = new ArrayList<>();

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.processFile("./src/input.csv");
        try {
            inventory.parseListDairy(dairyList);
            inventory.parseListFruit(fruitList);
        } catch (BadQuality b) {
            b.printStackTrace();
        }
        System.out.println(dairyList);
        System.out.println(fruitList);
    }

    public void processFile(String fileName) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            line = reader.readLine();
            productCount = Integer.parseInt(line);
            System.out.println("The number of products: " + productCount);
            while ((line = reader.readLine()) != null) {
                if(line.startsWith("D")) {
                    String[] dairyArray = line.split(";");
                    DairyProduct dp = new DairyProduct(Long.parseLong(dairyArray[1]), Long.parseLong(dairyArray[2]), dairyArray[3]);
                    dairyList.add(dp);
                } else if (line.startsWith("F")) {
                    String[] fruitArray = line.split(";");
                    Fruit fruit = new Fruit(fruitArray[1]);
                    fruitList.add(fruit);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void parseListDairy(ArrayList<DairyProduct> list) throws BadQuality {
        BufferedWriter writeGood = null;
        BufferedWriter writeExpired = null;
        try {
            writeGood = new BufferedWriter(new FileWriter("./src/shelf.txt", true));
            writeExpired = new BufferedWriter(new FileWriter("./src/trash.txt", true));
            for (int i = 0; i < list.size(); i++) {
                try {
                    if(list.get(i).stillGood()) {
                        writeGood.write(list.get(i).toString());
                    }
                } catch (BadQuality b) {
                    writeExpired.write((list.get(i).toString()));
                    b.printStackTrace();
                }

            }
            writeGood.flush();
            writeExpired.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writeGood.close();
                writeExpired.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void parseListFruit(ArrayList<Fruit> list) throws BadQuality {
        BufferedWriter writeGood = null;
        BufferedWriter writeExpired = null;
        try {
            writeGood = new BufferedWriter(new FileWriter("./src/shelf.txt", true));
            writeExpired = new BufferedWriter(new FileWriter("./src/shelf.txt", true));
            for (int i = 0; i < list.size(); i++) {
                try {
                    if(list.get(i).stillGood()) {
                        writeGood.write(list.get(i).toString() + "\n");
                    } else {
                        writeExpired.write(list.get(i).toString() + "\n");
                    }
                } catch (BadQuality b) {
                    writeExpired.write(list.get(i).toString() + "\n");
                }
            }
            writeGood.flush();
            writeExpired.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writeGood.close();
                writeExpired.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}