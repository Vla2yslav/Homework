package module10;

public final class ThreeException {

    public static void except(int i) {
         if (i == 0) throw new NullPointerException();
        else if (i == 1) new ClassCastException();
        else throw new ArithmeticException();
    }
}
