class CustomQueue {
    int[] data;
    int front;
    int rear;
    int size;

    public CustomQueue(int capacity) {
        data = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean add(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        rear++;
        data[rear] = item;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front++;
        size--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
}