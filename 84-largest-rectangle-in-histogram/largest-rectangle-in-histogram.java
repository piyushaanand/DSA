class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nseM = nse(heights);
        int[] pseM = pse(heights);
        int max = 0;

        for (int i = 0; i < n; i++) {
            int width = nseM[i] - pseM[i] - 1;
            max = Math.max(max, heights[i] * width);
        }
        return max;
    }

    public int[] nse(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return res;
    }

    public int[] pse(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek(); 
            st.push(i);
        }
        return res;
    }
}
