package module10;

public final class MethodWithException {

    public static void g() throws RuntimeException{
      throw new RuntimeException();
    }

    public static void f(){
       try{ g();}
       catch (RuntimeException e){
           throw new ArrayIndexOutOfBoundsException();
       }
    }
}
