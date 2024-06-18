package Leson_6;

public class MovieActorMain {
    public static void main(String[] args) {
        Actor actor = new Actor("Christian Bale ", 50);
        Actor actor1 = new Actor("Christoph  Waltz", 67);
        Actor actor2 = new Actor("Henry Cavil", 40);
        Actor[] actormovie = {actor, actor1, actor2};


        Movie movie = new Movie("Batman", "Action", 2008, actormovie);
        System.out.println(movie);

        System.out.println(actor);


        Movie movie1 = new Movie("Inglorius Bastards", "War", 2009, actormovie);
        System.out.println(movie1);
        System.out.println(actor1);


        Movie movie2 = new Movie("Man of Steel", "Action", 2013, actormovie);
        System.out.println(movie2);

        System.out.println(actor2);

    }
}
