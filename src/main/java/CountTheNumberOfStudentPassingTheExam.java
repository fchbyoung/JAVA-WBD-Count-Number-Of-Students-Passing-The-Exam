import java.util.Scanner;

public class CountTheNumberOfStudentPassingTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers;
        do {
            System.out.println("Enter the number of students: ");
            numbers = scanner.nextInt();
            if (numbers > 30) {
                System.out.println("The number of students should not less 0 and exceed 30");
            }
        } while (numbers > 30);

        int[] array = new int[numbers];
        System.out.println("Enter a mark for student: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Student " + (i + 1));
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int x : array) {
            if(x >= 5) {
                count++;
            }
        }
        System.out.println("The Number of students passing is: " + count);

    }
}
