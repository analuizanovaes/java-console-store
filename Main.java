package exercicioStoreList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Store> list = new ArrayList<>();

        System.out.print("How many products? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Product #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            Store store = new Store(id, name, price);
            list.add(store);
        }

        System.out.println();
        System.out.print("Enter the Id to remove: ");
        int idRemove = sc.nextInt();

        Store productRemove = null;

        for (Store x : list) {
            if (x.getId() == idRemove) {
                productRemove = x;
                break;
            }
        }

        if (productRemove == null) {
            System.out.println("This id does not exist!");
        } else {
            list.remove(productRemove);
            System.out.println("Removed successfully!");
        }

        Double sum = 0.0;

        System.out.println();
        System.out.println("List of remaining products:");

        for (Store product : list) {
            System.out.println(product);
            sum = sum + product.getPrice();
        }

        System.out.printf("Total Price: %.3f\n", sum);

        sc.close();
    }

}
