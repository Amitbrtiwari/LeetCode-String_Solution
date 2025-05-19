import java.util.Scanner;

public class MedicalBloodGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Blood Group (e.g., A+, B-, O+, AB-): ");
        String bloodGroup = sc.nextLine();

        System.out.print("Enter Medical Condition: ");
        String condition = sc.nextLine();

        System.out.println("\n--- Patient Details ---");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Blood Group    : " + bloodGroup);
        System.out.println("Medical Condition: " + condition);
    }
}
