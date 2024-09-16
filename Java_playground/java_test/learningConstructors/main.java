package Java_playground.java_test.learningConstructors;

public class main {
    
    public static void main(String[] args) {
        videoGameContainer games = new videoGameContainer();
        System.out.println(String.format("Game title: %s\nRelease year: %d\nGame score: %2.1f", games.game1.title, games.game1.releaseYear, games.game1.score));
        System.out.println(String.format("Game title: %s\nRelease year: %d\nGame score: %2.1f", games.game2.title, games.game2.releaseYear, games.game2.score));

    }
}
