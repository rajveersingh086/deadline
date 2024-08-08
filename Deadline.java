
import java.util.*;

public class Deadline {
    int profit, deadline;
    char job;
    public Deadline() {}

    public Deadline(int profit, int deadline, char job){
        this.job = job;
        this.profit = profit;
        this.deadline = deadline;
    }

    void printjobdeadlines(ArrayList<Deadline> arr, int t) {
        int n = arr.size();
        Collections.sort(arr, (a, b) -> b.profit - a.profit);
        boolean result[] = new boolean[t];
        char jobs[] = new char[t];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(t - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                if (result[j]==false) {

                    result[j] = true;
                    jobs[j] = arr.get(i).job;
                    break;
                }
            }
        }

        for (char jb : jobs)
            System.out.print(jb + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<Deadline> arr = new ArrayList<Deadline>();
        arr.add(new Deadline(35, 3, 'A'));
        arr.add(new Deadline(30, 4, 'B'));
        arr.add(new Deadline(25, 4, 'C'));
        arr.add(new Deadline(20, 2, 'D'));
        arr.add(new Deadline(15, 3, 'E'));
        arr.add(new Deadline(12, 1, 'F'));
        arr.add(new Deadline(5, 2, 'G'));
        System.out.println("deadline profit");

        Deadline job = new Deadline();
        job.printjobdeadlines(arr, 4); /* slot 0--1--2--3 */
    }
}


String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
 
        // A prime number
        int q = 101;
 
        // Function Call
        search(pat, txt, q);