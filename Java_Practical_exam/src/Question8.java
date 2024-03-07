import java.io.*;
public class Question8 {
    public static void  main(String[] args){

        try{
            int x = 100 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("Devision by Zero is not allowed" + e);

        }
    }
}
