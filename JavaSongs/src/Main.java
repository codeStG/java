import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Mirrorland", "EarthGang");
        album.addSong("LaLa Challenge", 3.51);
        album.addSong("UP", 3.35);
        album.addSong("Top Down", 3.17);
        album.addSong("Bank", 3.00);
        album.addSong("Proud of U", 3.58);
        album.addSong("This Side", 4.38);
        album.addSong("Swivel", 3.15);
        album.addSong("Avenue", 3.04);
        album.addSong("Tequila", 4.34);
        albums.add(album);

        album = new Album("June 27th", "DJ Screw");
        album.addSong("Crossroads", 12.59);
        album.addSong("All Bout U", 8.18);
        album.addSong("Surviv'n the Game", 8.00);
        album.addSong("Blue Moon", 3.59);
        album.addSong("Trippin", 4.18);
        album.addSong("Stuck", 4.31);
        album.addSong("Fields", 5.19);
        album.addSong("Wings", 4.07);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("UP", playList);
        albums.get(0).addToPlayList("This Side", playList);
        albums.get(0).addToPlayList("Swivel", playList);
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(7, playList);
        albums.get(1).addToPlayList(3, playList);

        play(playList);




    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing" + listIterator.next().toString());
                    } else {
                        System.out.println("You have reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("You are at the start of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("You are at the start of the playlist");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("You have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing: " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - to list the songs in the playlist\n" +
                "5 - to print the available options\n" +
                "6 - to delete the current song in the playlist");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("==========================================================");
    }

















}
