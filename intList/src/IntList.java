public class IntList {
    int first;
    IntList rest;
    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public int size(){
        if (rest==null){
            return 1;
        }
        return 1+this.rest.size();
    }

    public int iterativesize(){
        IntList p = this;
        int sum =0;
        while (p != null){
            sum += 1;
            p = p.rest;
        }
        return sum;
    }

    public int get(int i){
        int num = 0;
        IntList p = this;
        while (num != (p.size() - p.rest.size())){
            p = p.rest;
            num+=1;
        }
        return p.first;
    }

        public IntList incrList(IntList L, int x) {
        if (L==null){
            return L;
        }
            return new IntList(L.first+x,incrList(L.rest,x));
        }

        /** Returns an IntList identical to L, but with
         * each element incremented by x. Not allowed to use
         * the 'new' keyword. */
        public  IntList dincrList(IntList L, int x) {
            /* Your code here. */
            if (L==null){
                return L;
            }
            L.first+=x;
            L.rest = dincrList(L.rest,x);
            return L;
        }


    public static void main(String[] args) {
        IntList L = new IntList(5,null );
        L = new IntList(10,L);
        L = new IntList(15,L);
        System.out.println(L.incrList(L,2));
        System.out.println(L.dincrList(L,2));

    }
}