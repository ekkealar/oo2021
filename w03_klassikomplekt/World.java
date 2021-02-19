public class World {
  private int width;
  private int height;

  private GameCharacter gameCharacter;

  public World(int width, int height){
    this.width = width;
    this.height = height;
  }

  public void addCharacter(GameCharacter c){
    this.gameCharacter = c;
  }

  public void render(){
    char symbol;

    for (int y = 0; y <= height; y++){
      for (int x = 0; x <= width; x++){
        if (y == 0 || y == height){
          symbol = '-';
        } else if (x == 0 || x == width){
          symbol = '|';
        } else {
          symbol = ' ';
        }

        if (gameCharacter.x == x && gameCharacter.y == y){
          symbol = 'C';
        }

        System.out.print(symbol);
      }

      System.out.println("");
    }
  }
}
