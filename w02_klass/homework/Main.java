package homework;

public class Main {
    public static void main(String[] args) {
        album();
    }

    public static void album(){
        Album Yeezus = new Album();

        Yeezus.name("Yeezus");
        Yeezus.artist("Kanye");
        Yeezus.year(2013);
        Yeezus.genre("too many to count");
        Yeezus.lenght(40.01);
    }
}
