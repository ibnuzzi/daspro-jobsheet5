import java.util.Scanner;
public class PemilihanHariDenganIf19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayType;
        int dayNumber;

        System.out.print("Input day name: ");
        dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "Weekday";
        } else if (dayNumber >= 6 && dayNumber <= 7) {
            dayType = "Weekend";
        }else{
            dayType = "Invalid number";
        }

        System.out.println(dayType);
    }
}