public class Game {
    public static void main(String[] args) {
        GameCharacter char1 = new GameCharacter(4, 5, "mina", 'C');
        GameCharacter char2 = new GameCharacter(5, 6, "sina", 'D');

        Obstacle obs = new Obstacle(10, 11, "Rock", 'X');

        World world = new World(15, 15);

        world.wo.add(char1);
        world.wo.add(char2);
        world.wo.add(obs);

        world.render();
    }
}
