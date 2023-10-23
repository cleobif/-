import java.util.Scanner;

public class People {
    double age;
    String name;
    double height;
    boolean muslim;
    int wife;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        char a = symbol.charAt(0);
        People people1 = new People();
        people1.age = 17;
        people1.name = "Misha";
        people1.height = 185;
        people1.wife = 1;
        people1.muslim = false;
        People people2 = new People();
        people2.age = 30;
        people2.name = "Mujahid";
        people2.height = 178;
        people2.wife = 0;
        people2.muslim = true;
        double middleAge = People.middleAge(people1.age, people2.age);
        double middleHeight = People.middleHeight(people1.height, people2.height);
        int i = People.symbols(a, people1.name, people2.name);
        String[] wifeApp = People.wifeApproved(people1.wife, people2.wife, people1.muslim, people2.muslim);
        System.out.println("Middle age " + middleAge + "|| Middle height " + middleHeight + "|| Synbil name " + i);
        System.out.println("Misha status: " + wifeApp[0] + " || Mujahid status: " + wifeApp[1]);
    }

    public static double middleAge(double age1, double age2) {
        double i = (age1 + age2) / 2;
        return i;
    }

    public static double middleHeight(double height1, double height2) {
        double j = (height1 + height2) / 2;
        return j;
    }

    public static int symbols(char a, String name1, String name2) {
        int x = 0;
        for (int i = 0; i < name1.length(); i++) {
            if (a == name1.charAt(i)) {
                x++;
            }
        }
        for (int i = 0; i < name2.length(); i++) {
            if (a == name2.charAt(i)) {
                x++;
            }
        }
        return x;
    }

    public static String[] wifeApproved(int wife1, int wife2, boolean muslim1, boolean muslim2) {
        String[] muslim = new String[2];
        if (wife1 == 1 && !muslim1) {
            muslim[0] = "Misha not muslim, i molodec";
        } else
            muslim[0] = "Misha ahuel";
        while (muslim2) {
            muslim[1] = "Mujahid need wife";
        }
        return muslim;
    }
}



