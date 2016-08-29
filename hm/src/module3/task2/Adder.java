package module3.task2;

public class Adder extends Arithmetic {

    boolean check(Integer a, Integer b){
        boolean check = false;
        if (a>=b) check = true;
        return check;
    }
}
