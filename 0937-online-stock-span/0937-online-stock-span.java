

class StockSpanner {
    public class Pair {
        int price;
        int span;

        public  Pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }
    public StockSpanner() {

        st = new Stack<>();
    }

    // public ArrayList<Integer> arr = new ArrayList<Integer>();
    public Stack<Pair> st = new Stack<>();
    // public int count = 0;

    public int next(int price) {
        int span = 1;

        while(st.size() > 0 && st.peek().price <= price) {
            span += st.peek().span;
            // System.out.println(st.peek().price+"----->" + span);
            st.pop();
        }

        st.push(new Pair(price, span));
        return span;

        // int span = 0;
        // st.push(price);
        // count++;

        // // System.out.println("-------"+st.peek());
        // while (st.size() > 0 && st.peek() <= price) {
        // System.out.println("--->"+st.peek());

        // span = count - arr.lastIndexOf(st.peek());
        // st.pop();

        // System.out.println("--->>>>>"+span);

        // }

        // st.push(price);
        // // System.out.println("----------->>>>>"+st.peek());
        // return span;
    }

}

/*
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */