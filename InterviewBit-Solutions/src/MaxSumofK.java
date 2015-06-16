import java.util.ArrayDeque;
import java.util.Deque;

class MasSumofK{

    static Deque<Integer> deque;
    static int arr[] = {12, 1, 78, 90, 57, 89, 56};
    static int k = 3;

    MasSumofK(){
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int i;
        System.out.println(deque.toString());
        for(i=0;i<k;i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.getLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for(;i<arr.length;++i){
            System.out.println(arr[deque.getFirst()] + "::: value of I" + i);
            while(!deque.isEmpty() && deque.getFirst() <= i-k) {
                deque.pop();
            }

            while (!deque.isEmpty() && arr[i] >= arr[deque.getLast()]){
                deque.removeLast();
            }

            deque.addLast(i);
        }

        System.out.println(arr[deque.pop()]);
    }

    public static void main(String[] args){
        MasSumofK mc = new MasSumofK();

    }

}