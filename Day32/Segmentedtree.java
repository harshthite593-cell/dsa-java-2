//public class SegmentTree {
//
//    private int[] tree;
//    private int n;
//
//    // Constructor
//    public SegmentTree(int[] arr) {
//        n = arr.length;
//        tree = new int[4 * n]; // safe size
//        build(arr, 0, 0, n - 1);
//    }
//
//    // Build tree
//    private void build(int[] arr, int index, int start, int end) {
//        if (start == end) {
//            tree[index] = arr[start];
//            return;
//        }
//
//        int mid = (start + end) / 2;
//
//        build(arr, 2 * index + 1, start, mid);
//        build(arr, 2 * index + 2, mid + 1, end);
//
//        tree[index] = tree[2 * index + 1] + tree[2 * index + 2];
//    }
//
//    // Range Sum Query
//    public int query(int left, int right) {
//        return query(0, 0, n - 1, left, right);
//    }
//
//    private int query(int index, int start, int end, int left, int right) {
//
//        // No overlap
//        if (right < start || end < left) {
//            return 0;
//        }
//
//        // Complete overlap
//        if (left <= start && end <= right) {
//            return tree[index];
//        }
//
//        // Partial overlap
//        int mid = (start + end) / 2;
//
//        int leftSum = query(2 * index + 1, start, mid, left, right);
//        int rightSum = query(2 * index + 2, mid + 1, end, left, right);
//
//        return leftSum + rightSum;
//    }
//
//    // Update (change value at position)
//    public void update(int pos, int value) {
//        update(0, 0, n - 1, pos, value);
//    }
//
//    private void update(int index, int start, int end, int pos, int value) {
//
//        // Leaf node
//        if (start == end) {
//            tree[index] = value;
//            return;
//        }
//
//        int mid = (start + end) / 2;
//
//        if (pos <= mid) {
//            update(2 * index + 1, start, mid, pos, value);
//        } else {
//            update(2 * index + 2, mid + 1, end, pos, value);
//        }
//
//        // Update current node after child update
//        tree[index] = tree[2 * index + 1] + tree[2 * index + 2];
//    }
//}