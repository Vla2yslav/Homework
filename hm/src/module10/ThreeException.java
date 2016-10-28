package module10;

public final class ThreeException {

    public static void except(int i) throws Exception {
         if (i == 0) throw new MyPointerException("PointerException");
        else if (i == 1) new ScException("Ooh");
        else throw new VlException("Oups");
    }
}
