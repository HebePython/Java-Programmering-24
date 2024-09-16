package Java_playground.java_test.learningConstructors;

public class Videogame {
    int releaseYear = 1994;
    String title = "GTA";
    double score = 9.5;
    
    public Videogame (String title, int releaseYear, double score) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.score = score;

    }

    public Videogame(){
        this.title = title;
        this.releaseYear = releaseYear;
        this.score = score;
    }
}
