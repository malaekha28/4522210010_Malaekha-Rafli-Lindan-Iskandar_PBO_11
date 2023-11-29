import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Pisang");
        fruits.add("Nanas");
        fruits.add("Durgan");
        fruits.add("Kedondong");

        System.out.println("Sebelum Pengurutan: " + fruits);

        // Pengurutan alfabetis menggunakan lambda expression
        Collections.sort(fruits, (fruit1, fruit2) -> fruit1.compareTo(fruit2));

        System.out.println("Setelah Pengurutan: " + fruits);

        // Pengurutan berdasarkan panjang nama menggunakan lambda expression
        Collections.sort(fruits, Comparator.comparingInt(String::length));

        System.out.println("Setelah Pengurutan Berdasarkan Panjang Nama: " + fruits);
    }
}

