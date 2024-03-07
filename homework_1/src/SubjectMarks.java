import java.util.Scanner;
public class SubjectMarks {
    public  void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subject name: ");

        String subject = scanner.nextLine();
        int mark = getSubjectMark(subject);
        System.out.print("Subject mark for " + subject ": " + mark);

    }
    public int getSubjectMark(String subject){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark for " + subject + ": ");

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid numeric mark: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextInt();
    }
}
