package yarab;
import java.util.*;

/*public class HistoryOfTransaction {
	private final int max = 5; 
	private int pointer;
	private int[] queue;

	public void Deque(int max) {
	   
		this.queue = new int[max];
		this.pointer = 0;
	}

	public static boolean isEmpty(Deque D) {
		return (D.pointer == 0);
	}

	public static boolean isFull(Deque D) {
		return (D.pointer >= D.max);
	}

	public static void addFront(Deque D, int x) {
		if (!isFull(D)) {
			for (int i = D.pointer++; i > 0; i--) {
				D.queue[i] = D.queue[i - 1];
			}
			D.queue[0] = x;
		} else
			throw new IndexOutOfBoundsException("Deque full!");
	}

	public static void addBack(Deque D, int x) {
		if (!isFull(D))
			D.queue[D.pointer++] = x;
		else
			throw new IndexOutOfBoundsException("Deque full!");
	}

	public static int front(Deque D) {
		if (!isEmpty(D))
			return D.queue[0];
		else
			throw new IndexOutOfBoundsException("Deque empty!");
	}
	public static int removeFront(Deque D) {
		if (!isEmpty(D)) {
			int ret = D.queue[0];
			for (int i = 0; i < D.pointer - 1; i++) {
				D.queue[i] = D.queue[i + 1];
			}
			D.pointer--;
			return ret;
		} else
			throw new IndexOutOfBoundsException("Deque empty!");
	}

	public static int removeBack(Deque D) {
		if (!isEmpty(D))
			return D.queue[--D.pointer];
		else
			throw new IndexOutOfBoundsException("Deque empty!");
	}

	public static void printDeque(Deque D) {
		for (int i = 0; i < D.pointer; i++) {
			System.out.print(D.queue[i] + " ");
		}
		System.out.println();
	}

	
}*/
