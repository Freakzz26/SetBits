import java.util.Scanner;

public class SetBits {
    static void set(int number1,int number2)
    {
        int output=0;
        if(number1!=number2)
        {
            output= (int) Math.pow(2,number1);
            output= (int) (output+Math.pow(2,number2));

        }
        else
        {
            output= (int) Math.pow(2,number1);
        }
        System.out.println(output);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        set(number1,number2);
    }
}
