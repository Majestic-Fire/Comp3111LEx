package Lab2c;
import Lab2b.Book;

public class mainApp2c {
    public static void main(String arg[]) {
        final String array[] = {"Basic Java", "Advanced Java", "Gura Java"};
        Book b = new Book(array);
        int k = 2;
        System.out.println("The title of Chapter " +k+ " is " +b.getChapter(k-1));
        String anotherArray[] = b.getChapters();
        System.out.println("There are " +anotherArray.length + " chapters.");
        System.out.println(java.util.Arrays.toString(anotherArray));

    /* for Exercise 3, add following code: */
        Computer a = new MobileComputer();
        for (int i = 0; i < 10; i++)
            a.work();

        Charger c = new Charger();
        Phone p = new Phone();
        MobileComputer m = new MobileComputer();

        for (int i = 0; i < 10; i++) {
            System.out.print("This is m"+i+": ");
            m.work();
        }


        c.charge(p);
        c.charge(m);    // this does not work without fixing MobileComputer
    }
}