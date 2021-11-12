public class TowerOfHanoi {
    class Hanoi {

        public long toh(int N, int from, int to, int aux) {
            // Your code here
            if(N==0) return 0;
            long moves = toh(N-1, from, aux, to);
            System.out.println("move disk " +N+ " from rod " + from + " to rod " + to );
            long moremoves = toh(N-1, aux, to, from);
            return moves + moremoves + 1;
        }
    }
}
