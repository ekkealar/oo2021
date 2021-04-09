import java.util.ArrayList;
import java.util.List;

public class World {
    private int width;
    private int height;

    public List<WorldObject> wo = new ArrayList<>();

    public World(int width, int height){
        this.width = width;
        this.height = height;
    }

    // public void getDefinition(){
    //     for (WorldObject wo : worldObject){
            
    //     }
    // }

    public void render(){
        char symbol;

        for (int y = 0; y <= height; y++){
            for (int x = 0; x <= width; x++){
                if(y == 0 || y == height){
                    symbol = '-';
                } else if (x == 0 || x == width){
                    symbol = '|';
                } else {
                    symbol = ' ';
                }

                for(WorldObject wObject : wo){
                    if(x == wObject.x && y == wObject.y){
                        symbol = wObject.symbol;
                    }
                }

                System.out.print(symbol);
            }

            System.out.println("");
        }
    }
}
