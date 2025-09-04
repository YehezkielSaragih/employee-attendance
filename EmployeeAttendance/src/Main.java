import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Title
        System.out.println("Employee Attendance\n");

        // Open scanner
        Scanner inputScanner = new Scanner(System.in);

        // Initialization
        String attendance;
        boolean[] attendanceList = new boolean[5];
        int presentDays =0;
        int absentDays=0;
        String status;

        // Input
        for(int i=0; i<5; i++){

            System.out.print("Day " + (i+1) + " attendance = ");
            attendance = inputScanner.nextLine().toLowerCase();
            switch (attendance){
                case "true":
                    attendanceList[i]=true;
                    presentDays++;
                    break;
                case "false":
                    attendanceList[i]=false;
                    absentDays++;
                    break;
                default:
                    System.out.println("Error: Invalid attendance status!");
                    return;
            }
        }

        // Logic status
        // or u can use for loop in boolean list
        if (presentDays == 5) {
            status = "Full Attendance";
        } else if (absentDays <= 2) {
            status = "Good";
        } else {
            status = "Warning";
        }

        // Print
        System.out.println("\nReport");
        System.out.println("Attendance Recap = " + Arrays.toString(attendanceList));
        System.out.println("Total Days Present = " + presentDays);
        System.out.println("Total Days Absent = " + absentDays);
        System.out.println("Status = " + status);
    }
}