import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("King For A Day");
        Playlist.add("Im Not Okay");
        Playlist.add("Bulls in the Bronx");
        Playlist.add("I Don't Love You");
        Playlist.add("You Only Live Once");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("Russian Roulette");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Candy Pop");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Knock Knock");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}