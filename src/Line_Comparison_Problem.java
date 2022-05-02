import java.util.*;
public class Line_Comparison_Problem {
    static void equalsTo(Integer lenght1, Integer lenght2){
        boolean result = lenght1.equals(lenght2);

        if ( result == true )
            System.out.println("Length of lines is Equal");
        else
            System.out.println("Lines are not equals...");
    }
    //Method For Comparing Line
    static void compareTo(Integer length1,Integer length2){
        int result = length1.compareTo(length2);
        if(result>0)
            System.out.println("Line One is greater :");
        else if(result<0)
            System.out.println("Line two is greater : ");
        else
            System.out.println("Both lines are Equal...");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //accepting co-ordinates for line one
        System.out.println("Enter co-ordinates  For X1");
        int x1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For Y1");
        int y1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For X2");
        int x2 = sc.nextInt();
        System.out.println("Enter co-ordinates  For Y1");
        int y2 = sc.nextInt();

        //calculating length 1
        Integer length1 = (int) Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);

        //Accepting co-ordinates for line 2
        System.out.println("\nEnter co-ordinates  For A1");
        int a1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For B1");
        int b1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For A2");
        int a2 = sc.nextInt();
        System.out.println("Enter co-ordinates For B2");
        int b2 = sc.nextInt();
        //calculating Length 2
        Integer length2 = (int) Math.sqrt((a2 - a1) * 2 + (b2 - b1) * 2);

        //print length 1 and length 2
        System.out.println("Length of 1st line is : " + length1);
        System.out.println("Length of second line is : " + length2);

        equalsTo(length1, length2);
        compareTo(length1, length2);
    }

}
