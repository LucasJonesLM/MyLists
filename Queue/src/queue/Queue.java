package queue;

public class Queue {

	 	private int[] vals;
	    private int size;
	    private int start;
	    
	    public void push(int a) {
	        // if necessary, double the size of vals
	        // copy the values from the existing array to the new one
	        if (this.size >= this.vals.length) {
	            int[] arr = new int[this.vals.length * 2];
	            for (int i = 0; i < this.size; i++) {
	                arr[i] = this.vals[i];
	            }
	            this.vals = arr;
	        }
	        this.vals[this.size] = a;
	        this.size++;
	        return;
	    }
	    
	    public int pop() {
	        if ((this.size - this.start) <= 0) {
	            throw new RuntimeException("nothing more to pop");
	        }
	        this.start++;
	        return this.vals[this.start - 1];
	    }
	    
	    public int size() {
	        return this.size;
	    }
	    
	    public Queue() {
	        this.vals = new int[1];
	        this.size = 0;
	        this.start = 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue que;
        que = new Queue();
        System.out.println(que.size());
        que.push(-14);
        que.push(976);
        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());

	}

}
