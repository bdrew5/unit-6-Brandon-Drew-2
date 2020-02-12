public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("a", "m", 12, 39.1);
        Album a5 = new Album("b", "x", 12, 39.1);
        Album a6 = new Album("c", "c", 12, 39.1);
        Album a7 = new Album("y", "b", 12, 39.1);
        Album a8 = new Album("z", "k", 12, 39.1);
        Album a9 = new Album("h", "u", 12, 39.1);
        Album a0 = new Album("r", "e", 12, 39.1);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);



        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

       myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test Insertion Sort");


        myLibrary.sortByArtist();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        int num = myLibrary.binarySearch("x", "artist");
        System.out.println(num);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        int loc = myLibrary.findTitle("Second");
        System.out.println("Found First at Index: " + loc);
        System.out.println(myLibrary.getAlbum(loc));

    }
}
