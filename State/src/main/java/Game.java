import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of your character: ");
        String name = scanner.nextLine();
        GameCharacter character = new GameCharacter(name);

        while (true) {
            System.out.println("\nCurrent Status: " + character.getStatus());
            System.out.println("Choose an action: 1. Train 2. Meditate 3. Fight 4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    character.train();
                    break;
                case 2:
                    character.meditate();
                    break;
                case 3:
                    character.fight();
                    break;
                case 4:
                    System.out.println("Exiting the game");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice please choose again");
            }
        }
    }
}
