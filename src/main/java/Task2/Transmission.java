package Task2;

public class Transmission {

    private int biezacyBieg;
    public int zwiekszonybieg() {
        if (biezacyBieg == 7) {
            System.out.println("Nie można zwiekszyc prędkości");
            return biezacyBieg;
        }
            biezacyBieg = biezacyBieg + 1;
            return biezacyBieg;
        }
        public int zmniejszonybieg() {
            if (biezacyBieg == 0) {
                System.out.println("Nie można zmniejszyć prędkości");
                return biezacyBieg;
            }
            biezacyBieg = biezacyBieg - 1;
            return biezacyBieg;
        }

    public boolean isJedynkaBiezacyBieg() {
        return biezacyBieg == 1;
    }
}
