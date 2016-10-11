import java.util.Queue;
import java.util.LinkedList;

public class Queues{
   public static void main(String[] args){
      Queue<String> testQueue = new LinkedList<String>();
      
      testQueue.add("Eggs");
      testQueue.add("Bread");
      testQueue.add("Milk");
      
      System.out.println("The first item in the Queue is: " + testQueue.remove());
      System.out.println("The second item in the Queue is: " + testQueue.remove());
      System.out.println("The final item in the Queue is: " + testQueue.remove());
      }
}
