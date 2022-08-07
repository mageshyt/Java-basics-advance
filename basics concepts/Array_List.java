import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {

        // ArrayList= a resizable array that can hold elements of different types
        // ! Element can be added and removed from after compilation phase

        ArrayList<String> food = new ArrayList();

        Scanner sc = new Scanner(System.in);
        food.add("Grapes");
        food.add("Apples");
        food.add("Oranges");
        food.remove(1); // ! remove element at index 1
        for (String string : food) {
            System.out.println("My Favorite Food: " + string);
        }
        ArrayList<String> DrinksList = new ArrayList<String>();
        DrinksList.add("String 😀");
        DrinksList.add("Coke");
        DrinksList.add("Banana");

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // ! 2d array

        ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();

        arrayList.add(food);
        arrayList.add(DrinksList);

        System.out.println(arrayList);

        System.out.println(arrayList.get(0).get(1)); // this will get the 2 nd element of the 1st arraylist
        int n = 4;

        for (int i = 0; i < n; i++) {
            int userInt = sc.nextInt();
            numbers.add(userInt);
        }

        System.out.println("Number of elements: " + numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }

    }

}
