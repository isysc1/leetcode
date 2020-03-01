/**
 * @author isysc1@163.com
 * @date 2020/2/29
 */
public class SolutionO29_2 {

    private LinkedList<Integer> data;
    private LinkedList<Integer> maxQue;

    public MaxQueue() {
        data = new LinkedList<>();
        maxQue = new LinkedList<>();
        maxQue.addLast(Integer.MIN_VALUE);
    }

    public int max_value() {
        if (data.isEmpty()) {
            return -1;
        }
        return maxQue.peekFirst();
    }

    public void push_back(int value) {
        data.addLast(value);
        while (!maxQue.isEmpty() && maxQue.peekLast() < value) {
            maxQue.removeLast();
        }
        maxQue.addLast(value);
    }

    public int pop_front() {
        if (data.isEmpty()) return -1;
        int front = data.removeFirst();
        if (maxQue.peekFirst() == front) {
            maxQue.removeFirst();
        }
        return front;
    }


/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */


}
