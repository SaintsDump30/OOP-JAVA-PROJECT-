
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int variable;
        System.out.println("Please enter the variable value");

        variable=sc.nextInt();

        switch(variable)
        {
            case 1:
                System.out.println("The value of the variable = "+variable);
                break;
            case 2:
                System.out.println("The value of the variable ="+variable);
                break;
            case 3:
                System.out.println("The value of the variable =" + variable);
                break;
            case 5:
                System.out.println("The value of the variable =" + variable);
                break;
            default:
                System.out.println("The value of the variable is neither 1 nor 2 nor 3");

        }

    }
}