import java.util.ArrayList;

public class Heap {
	
	ArrayList<Integer> data = new ArrayList<>();
	
	public void add(int item) {
		data.add(item);
		upheapify(data.size()-1);
	}
	
	private void upheapify(int ci) {
		int pi = (ci-1)/2;
		
		if(data.get(ci) < data.get(pi)) {
			swap(ci,pi);
			upheapify(pi);
		}
	}
	
	private void swap(int i, int j) {
		
		int ith = data.get(i);
		int jth = data.get(j);
		
		data.set(i, jth);
		data.set(j, ith);
	}
	
	public void display() {
		System.out.println(this.data);
	}
	
	public int size() {
		return this.data.size();
	}
	
	public boolean isempty() {
		return this.size()==0;
	}
	
	public int remove() {
		
		swap(0,data.size()-1);
		int rv = this.data.remove(this.data.size()-1);
		downheapify(0);
		
		return rv;
	}
	
	private void downheapify(int pi) {
		
		int rci = pi*2 + 1;
		int lci = pi*2 + 2;
		
		int min = pi;
		
		if(lci < this.data.size() && data.get(lci) < data.get(min)) {
			min = lci;
		}
		
		if(rci < this.data.size() && data.get(rci) < data.get(min)) {
			min = rci;
		}
		
		if(min!= pi) {
			swap(min,pi);
			downheapify(pi);
		}
	}
	
	public int get() {
		return this.data.get(0);
	}
	
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.add(10);
		heap.display();
		heap.add(20);
		heap.display();
		heap.add(30);
		heap.display();
		heap.add(6);
		heap.display();
		heap.add(1);
		heap.display();
		System.out.println(heap.size());
		System.out.println(heap.isempty());
		while(!heap.isempty()) {
			System.out.println(heap.remove());
		}
	}
}
