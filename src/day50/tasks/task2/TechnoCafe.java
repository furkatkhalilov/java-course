package day50.tasks.task2;

import day50.tasks.task2.food.Food;
import day50.tasks.task2.food.Kebab;
import day50.tasks.task2.food.Maklube;

public class TechnoCafe {

    public static void main(String[] args) {
        Food kebab = new Kebab();
        Food maklube = new Maklube();

        Kitchen fetihKitchen = new Kitchen();

        System.out.println("---------kebab----------");
        fetihKitchen.cook(kebab);
        System.out.println("---------maklube----------");
        fetihKitchen.cook(maklube);

    }
}
