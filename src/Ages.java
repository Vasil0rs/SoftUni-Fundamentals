import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                int age = scanner.nextInt();

                String person ;

                if ( age <= 2) {
                    person = "baby";
                } else if ( age <= 13) {
                    person = "child";
                } else if ( age <= 19) {
                    person = "teenager";
                } else if ( age <= 65) {
                    person = "adult";
                } else {
                    person = "elder";
                }
                System.out.println(person);
            }
        }



