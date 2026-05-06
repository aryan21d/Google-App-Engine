import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        int[] burstTime = new int[n];
        int[] waitTime = new int[n];
        int[] turnAroundTime = new int[n];

        System.out.println("Enter Burst Time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("P" + (i + 1) + ": ");
            burstTime[i] = sc.nextInt();
        }

        waitTime[0] = 0; 
        for (int i = 1; i < n; i++) {
            waitTime[i] = waitTime[i - 1] + burstTime[i - 1];
        }

        System.out.println("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            turnAroundTime[i] = burstTime[i] + waitTime[i];
            System.out.println("P" + (i + 1) + "\t\t" + burstTime[i] + "\t\t" + waitTime[i] + "\t\t" + turnAroundTime[i]);
        }
        sc.close();
    }
}