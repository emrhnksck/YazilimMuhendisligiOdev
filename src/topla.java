public class topla {

    public int topla(int a, int b){
        return a + b;
    }

    public void bolme(int a , int b){
        try {
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("You cannot divide a number by zero");
        }
    }
}
