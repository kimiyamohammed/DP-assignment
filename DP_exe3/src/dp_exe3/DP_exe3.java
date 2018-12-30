package dp_exe3;
public class DP_exe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int div(int a, int b){
    int quotient = 0;
    try{
        quotient = a / b;
    }
    catch(ArithmeticException e){
        e.printStackTrace();
    }
    finally{
        return quotient;
    }
    }
}
