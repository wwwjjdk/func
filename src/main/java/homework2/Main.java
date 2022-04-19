package homework2;

import java.util.*;

public class Main {
    public static final int COUNT = 4;
    public static int price = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        price = scanner.nextInt();

        List<Home> array = createArray();
        System.out.println(array);

        array.stream().filter(x -> (x.getHeight() * x.getLength()) * price == x.getCost()).forEach(System.err::println);
    }

    public static List<Home> createArray() {
        List<Home> arrayList = new ArrayList<>();

        for (int i = 0; i < COUNT; i++) {
            int length = createInt();
            int height = createInt();
            arrayList.add(new Home(length, height, getCost(length, height)));
        }
        return arrayList;
    }

    public static int createInt() {
        while (true) {
            int i = (int) Math.floor(Math.random() * 10);
            if (i != 0) {
                return i;
            }
        }
    }

    public static int getCost(int i, int j) {
        int ver = (int) Math.floor(Math.random() * 10);
        if (ver > 5) {
            return (i * j) * (price + 1);
        } else {
            return (i * j) * price;
        }
    }
}
