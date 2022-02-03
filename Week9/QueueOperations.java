import java.util.*;

public class QueueOperations {
    // { Driver Code Starts
    // Initial Template for Java

    // } Driver Code Ends
    // User function Template for Java

    // Helper class Geeks to implement
    // insert() and findFrequency()
    static class Geeks {

        // Function to insert element into the queue
        static void insert(Queue<Integer> q, int k) {

            // Your code here
            q.add(k);

        }

        // Function to find frequency of an element
        // rteturn the frequency of k
        static int findFrequency(Queue<Integer> q, int k) {

            // Your code here
            // return Collections.frequency(q,k);//Right answer
            HashMap<Integer, Integer> freq = new HashMap<>();

            // hasNext() returns true if the queue has more elements
            for (Integer item : q) {
                // next() returns the next element in the iteration
                int key = item;
                freq.put(key, freq.getOrDefault(key, 0) + 1);
            }
            return freq.getOrDefault(k, -1);

        }

    }

    // { Driver Code Starts.

    // Driver class with driver code
    static class GFG {

        // Driver code
        public static void main(String[] args) {

            // Taking input using scanner class
            Scanner sc = new Scanner(System.in);
            int testcase = sc.nextInt();

            while (testcase-- > 0) {
                // Declaring Queue
                Queue<Integer> q = new LinkedList<>();
                int n = sc.nextInt();

                // Invoking object of Geeks class
                Geeks obj = new Geeks();

                for (int i = 0; i < n; i++) {
                    int k = sc.nextInt();
                    obj.insert(q, k);
                }

                int x = sc.nextInt();
                for (int i = 0; i < x; i++) {
                    int k = sc.nextInt();
                    int f = obj.findFrequency(q, k);
                    if (f != 0) {
                        System.out.println(f);
                    } else {
                        System.out.println("-1");
                    }
                }
            }
        }
    } // } Driver Code Ends
}
