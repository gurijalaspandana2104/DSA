 public class Nearestsmallest {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
         Stack<Integer>stack=new Stack<>();
         ArrayList<Integer>list=new  ArrayList<>();
         for(int i= 0;i<A.size();i++ )
         {
            while(!stack.isEmpty()&&stack.peek()>= A.get(i) )
             {
                stack.pop();
             }
             if(!stack.isEmpty()&&stack.peek()< A.get(i) )
             {
            list.add( stack.peek() );
             }
             else
             {
                list.add(-1);
             }
             stack.push(A.get(i));
    } 
    return list;
}
}