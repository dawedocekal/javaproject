package org.redhat.vehicles;
import java.util.Scanner;

/**
 * Created by Davča on 26.4.2017.
 */
public class Tryinginstances {
    public static void main(String[] args) {
        String brand;
        //ahoj
        int numberOfWheels;
        Scanner sc = new Scanner(System.in);
        System.out.println("Znacka");
        String br = sc.nextLine();
        System.out.println("Pocet kol");
        int num = sc.nextInt();
        brand = br;
        numberOfWheels = num;
        Car auto = new Car(brand, numberOfWheels);
        System.out.println(auto.isHasEngine());
        System.out.println(auto.getBrand());
        System.out.println(auto.getNumberOfWheels());
    }
}
