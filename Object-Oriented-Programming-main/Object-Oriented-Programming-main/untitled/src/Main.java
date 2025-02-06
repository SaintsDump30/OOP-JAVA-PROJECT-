
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String course="java";
        switch(course)
        {
            case "python":
                System.out.println("Python was made by Guido Van Rossum");
                break;
            case "java":
                System.out.println("What version of Java are you using?");
                int version=sc.nextInt();
                switch(version)
                {
                    case 6:
                        System.out.println("That is old school!");
                        break;
                    case 8:
                        System.out.println("Wow, that’s great! Tons of new features!");
                        break;

                }
                break;
            case "c++":
                System.out.println("C ++ was made by Bjarne Stroustrup");
                break;

        }
    }
}