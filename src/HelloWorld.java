import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello boi, you already know who it is");

        int age = 26;
        double GPA = 3.02;
        char firstInitial = 'A';
        char lastInitial = 'V';
        boolean hasPerfectAttendance = true;
        String name = "Anthony Viramontes";
        firstInitial = name.charAt(0);
        lastInitial = name.charAt(name.indexOf(" ") + 1);

        System.out.println(age);
        System.out.println(GPA);
        System.out.println(firstInitial);
        System.out.println(lastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(name);

        String fn = "Anthony";
        String ln = "Viramontes";
        String fullName = fn + " " + ln;
        System.out.println(fullName);

        Scanner input = new Scanner (System.in);

        System.out.print("Enter your GPA boi: ");
        GPA = input.nextDouble();
        System.out.println(GPA);



    }
}
