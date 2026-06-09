import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mark: ");
            int mark = sc.nextInt();
            sc.nextLine();

            names.add(name);
            marks.add(mark);
        }

        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int mark : marks) {
            total += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = (double) total / n;

        System.out.println("\n===== STUDENT REPORT =====");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " : " + marks.get(i));
        }

        System.out.println("\nAverage Mark : " + average);
        System.out.println("Highest Mark : " + highest);
        System.out.println("Lowest Mark  : " + lowest);

        sc.close();
    }
}