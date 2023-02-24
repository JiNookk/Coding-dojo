public class Exchanger {
    protected int bottles;

    public Exchanger(int bottles) {
        this.bottles = bottles;
    }


    public int exchange(int expended, int given) {
        int exchanged = 0;

        while (this.bottles - expended >= 0) {
            this.bottles -= expended;
            this.bottles += given;
            exchanged += given;
        }

        return exchanged;
    }
}
