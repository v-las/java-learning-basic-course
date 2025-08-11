import java.util.Scanner;

public class FruitCounter {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("How many apples: ");
    int amountOfApples = Integer.parseInt(userInput.nextLine());
    System.out.printf("You have %s apples.%n", amountOfApples);

    System.out.print("How many bananas: ");
    int amountOfBananas = Integer.parseInt(userInput.nextLine());
    System.out.printf("You have %s bananas.%n", amountOfBananas);

    String howManyFruits = amountOfApples + amountOfBananas > 10 ? "lot of" : "few";

    System.out.printf("You have a %s fruits.", howManyFruits);
  }
}
