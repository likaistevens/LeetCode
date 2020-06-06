
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author kaili
 */
public class mianshi51 {

    public static void transferList(List<Integer> l, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < l.size(); i++) {
            if (i % 2 == 1) {
                pq.add(new int[]{l.get(i), i});
            }
        }
        while (pq.size() > k) {
            int[] x = pq.poll();
            l.set(x[1], 1);
        }
        while (!pq.isEmpty()) {
            int[] x = pq.poll();
            l.set(x[1], 0);
        }
    }

    public static void main(String[] args) {
        mianshi51 m = new mianshi51();
        System.out.println(m.hashCode());
    }

}
