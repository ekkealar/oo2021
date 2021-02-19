import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    int width = 20;
    int height = 10;

    World world = new World(width, height);
    GameCharacter player = new GameCharacter("Raimo", 2, 3, GameCharacterType.WIZARD);

    world.addCharacter(player);
    world.render();
    System.out.println(player);

    Scanner scanner = new Scanner(System.in);
    String input = "";

    while(!input.equals("end")){
      input = scanner.nextLine();

      if (input.equals("")){
        player.move();
      } else if (input.toLowerCase().equals("l")){
        player.setDirection(Direction.LEFT);
      }

      

      world.render();
      System.out.println(player);
    }
  }
}
