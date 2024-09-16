 package Java_playground.java_test.learningConstructors;

public class Main {

    public static void main(String[] args) {

        videoGameContainer games = new videoGameContainer();
        games.game1.title = "C&C";
        games.game1.releaseYear = 1991;
        games.game1.score = 9.1;
        System.out.println(String.format("Game1\nGame title: %s\nRelease year: %d\nGame score: %2.1f", games.game1.title, games.game1.releaseYear, games.game1.score));
        System.out.println(String.format("Game2\nGame title: %s\nRelease year: %d\nGame score: %2.1f", games.game2.title, games.game2.releaseYear, games.game2.score));
       
        Videogame game3 = new Videogame("Diablo", 2001, 9.8);
        System.out.println(String.format("Game3\nGame title: %s\nRelease year: %d\nGame score: %2.1f", game3.title, game3.releaseYear, game3.score));   
       
        Videogame game4 = games.game1;
        System.out.println(String.format("Game4\nGame title: %s\nRelease year: %d\nGame score: %2.1f", game4.title, game4.releaseYear, game4.score));

        // task 5
        System.out.println(String.format("game1: %s\ngame2: %s\ngame3: %s\ngame4: %s",  games.game1, games.game2, game3, game4));
        // game1 same reference as game4. game 1 & 3 has different references. 
        // on line 20 game4 is assigned to same as game1 from container. So same reference
        // game2 & 3 have their own instances with keyword 'new' so have their own references.
    }
}
