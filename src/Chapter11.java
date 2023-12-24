interface Queue {
	boolean isEmpty();
	void Enqueue(int x);
	int Dequeue();
}

class MyQueue implements Queue {
	int[] itemArray;
	int front, rear;
	int count;
	public MyQueue() {
		itemArray = new int[50];
		front = 0;
		rear = 0;
		count = 0;
	}
	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}
	public void Enqueue(int x) {
		itemArray[rear] = x;
		rear = rear + 1;
		count++;
		System.out.println(x + "입력 : 원소개수 " + count);
	}
	public int Dequeue() {
		if (isEmpty()) {
			System.out.println("큐가 비었음");
			return 0;
		}
		int out = itemArray[front];
		front = front + 1;
		count--;
		System.out.println(out + "출력 : 원소개수 " + count);
		return out;
	}
}

public class Chapter11 {
	public void question() {
		MyQueue mq = new MyQueue();
		for (int ii = 0; ii < 10; ii++)
			mq.Enqueue(ii);
		for (int ii = 0; ii < 10; ii++)
			mq.Dequeue();
		mq.Dequeue();
	}
}
