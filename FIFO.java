import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
    public static void main(String[] args) {
        int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3};
        int capacity = 3;
        
        HashSet<Integer> s = new HashSet<>(capacity);
        Queue<Integer> indexes = new LinkedList<>();
        int page_faults = 0;

        for (int page : pages) {
            if (s.size() < capacity) {
                if (!s.contains(page)) {
                    s.add(page);
                    page_faults++;
                    indexes.add(page);
                }
            } else {
                if (!s.contains(page)) {
                    int val = indexes.poll();
                    s.remove(val);
                    s.add(page);
                    indexes.add(page);
                    page_faults++;
                }
            }
        }
        System.out.println("Total Page Faults: " + page_faults);
    }
}
