import java.util.Scanner;

public class SgpaCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of subjects");
        int nsub = sc.nextInt();
        double totalcred = 0;
        double totalgrdpt = 0;
        for (int i = 1; i <= nsub; i++) {
            System.out.println("enter credit of subject " + i);
            double cred = sc.nextDouble();
            System.out.println("enter grade of subject " + i);
            String grade = sc.next();
            double gradepoints = getGradePoints(grade);
            totalcred += cred;
            totalgrdpt += gradepoints * cred;
        }
        double sgpa = totalgrdpt / totalcred;
        System.out.println("your sgpa is : " + sgpa);
        sc.close();

    }

    public static double getGradePoints(String grade) {
        switch (grade.toUpperCase()) {
            case "A":
                return 10.0;
            case "A-":
                return 9;
            case "B+":
                return 8;
            case "B":
                return 7;
            case "C":
                return 6;
            case "D":
                return 5;
            case "E":
                return 4;
            case "F":
                return 0;
            default:
                System.out.println("Invalid grade entered.");
                return 0.0;

        }
    }

}
