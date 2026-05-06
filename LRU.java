import java.util.ArrayList;

public class Lru {
    public static void main(String[] args) {
        int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3};
        int capacity = 3;
        ArrayList<Integer> frame = new ArrayList<>(capacity);
        int pageFaults = 0;

        for (int page : pages) {
            if (!frame.contains(page)) {
                if (frame.size() == capacity) {
                    frame.remove(0);
                }
                frame.add(page);
                pageFaults++;
            } else {
                frame.remove((Integer) page);
                frame.add(page);
            }
        }
        System.out.println("Total Page Faults (LRU): " + pageFaults);
    }
}