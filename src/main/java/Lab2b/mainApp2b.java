//* [mainApp2b] that can call the [Score] class under [Lab 2a]
//import Lab2a.Score;

package Lab2b;

public class mainApp2b {
    public static void main(String arg[]) {
        final String array[] = {"Basic Java", "Advanced Java", "Guru Java"};
        Book b = new Book(array);
        int k = 2;
        System.out.println("The title of Chapter " +k+ " is " +b.getChapter(k-1));
        String anotherArray[] = b.getChapters();

        System.out.println("There are " +anotherArray.length+ " chapters.");
        System.out.println(anotherArray);

        //! Key: Use APIs "java.util.Arrays" to print array content
        System.out.println(java.util.Arrays.toString(anotherArray));
    }
}