/*
 * We prefer to make Heap using Array or ArrayList.
 * There are 2 kind of Heap. minHeap & maxHeap
 * 
 [Point]
 1. ParentIndex = ChildIndex/2;
 2. LeftChild = ParentIndex*2;
 3. RightChild = ParentIndex*2+1;
 4. First Idx is 1 not 0.

 It's minHeap using ArrayList.
 */
package heap;

import java.util.ArrayList;

public class minHeap_yet {
	private ArrayList<Integer> heap; // Arraylist called heap.
	
	public void minHeap() {
		heap = new ArrayList<>();
		heap.add(0);
	}
	
	public void insert(int val) {
		heap.add(val);
		int addedIdx = heap.size()-1;
		int parentIdx = addedIdx/2;
		
		while(addedIdx > 1 && heap.get(parentIdx) > heap.get(addedIdx)) {
			int tmp = heap.get(parentIdx);
			heap.set(parentIdx,heap.get(addedIdx));
			heap.set(addedIdx, tmp);
			
			addedIdx = addedIdx /2; //To keep comparing Parent and addedValue swaped.
		}
	}

	public int poll() {
		if(heap.size()-1 < 1) {
			return 0;
		}
		
		int deleteVal = heap.get(1);
		
		heap.set(1, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int idx= 1;
		while((idx*2) < heap.size()) {
			
			int minIdx = idx*2; //Suppose LeftChild is lowest.
			int minVal = heap.get(minIdx);
			
			if((idx*2+1) < heap.size() && heap.get(idx*2) > heap.get(idx*2+1)) {
				minVal = heap.get(idx*2+1);
				minIdx = idx*2+1;
			}

			if(heap.get(idx) < minVal)
				break;
		
			int tmp = heap.get(minIdx);
			heap.set(idx, heap.get(minIdx));
			heap.set(minIdx,tmp);
		}
		return deleteVal;		
		
	}
	
	

		
	public static void main(String args[]) {
		minHeap heap = new minHeap();
		
		heap.insert(3);
		heap.insert(5);
		heap.insert(7);
		heap.insert(9);
		heap.insert(1);
		
		int val = heap.poll();
		System.out.println(val);
		
		
		
		

		
	}
}
