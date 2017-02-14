import java.util.ArrayDeque;

public class ColaSale {

	ArrayDeque<Buyers> queue = new ArrayDeque<Buyers>();

	public ColaSale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColaSale(ArrayDeque<Buyers> queue) {
		super();
		this.queue = queue;
	}

	public ArrayDeque<Buyers> getQueue() {
		return queue;
	}

	public void setQueue(ArrayDeque<Buyers> queue) {
		this.queue = queue;
	}
	
	protected void addBuyers (Buyers b){
		queue.add(b);
	}
	
	protected void buyCola(int a){
		for (int i = 1; i <= a; i++) {
			queue.offerLast(queue.pollFirst());
			queue.offerLast(queue.getLast());
		}
	}
	
	

	@Override
	public String toString() {
		return "ColaSale [queue=" + queue + "]";
	}
	
	
	

}
