package module10;

public class Main {
static void show () throws MyException {
    MyException ex = new MyException("Ooh");
    System.out.println(ex.toString());
     throw ex;
}

    public static void main(String[] args) {
Integer a = null;
      try {
          throw new Exception("It's exception");
      }
      catch (Exception ex){
          System.out.println(ex.toString());
      }


      try{
          show();
      }
      catch (MyException e){

      }


      try{
          a.toString();
      }
      catch(NullPointerException e){
          System.out.println("You caught exception: "+e.toString());
      }

        try{
            ThreeException.except(2);
        }
        catch(NullPointerException  | ClassCastException | ArithmeticException e){
            System.out.println("You caught all exception");
        }

        MethodWithException.f();
    }
}
