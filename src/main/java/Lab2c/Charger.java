// !   Add interface to the class
package Lab2c;

interface Chargeable {
    public void charge();
}
public class Charger {
    public void charge(Chargeable c) {
        c.charge();
    }
}
