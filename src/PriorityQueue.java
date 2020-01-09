import java.util.Queue;

public class PriorityQueue {

  public static void main(String[] args) {
    Queue<Integer> queue = new java.util.PriorityQueue<>();
    queue.add(45);
    queue.add(1);
    queue.add(40);
    queue.add(43);


    System.out.println(queue);
    while (!queue.isEmpty()){
      Integer poll = queue.poll();
      System.out.println(poll);
    }

  }

}
