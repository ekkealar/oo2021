package homework;

public class Album {
    String albumName;
    String artistName;
    int releaseYear;
    String musicGenre;
    double albumLenght;

    public void name (String albumName) {
        this.albumName = albumName;
    }
    public void artist (String artistName) {
        this.artistName = artistName;
    }
    public void year (Integer releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void genre (String musicGenre) {
        this.musicGenre = musicGenre;
    }
    public void lenght (double albumLenght) {
        this.albumLenght = albumLenght;
    }
}
