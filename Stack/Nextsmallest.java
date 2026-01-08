 class Nextsmallest{
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        Stack<Integer>stack=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&stack.peek()>=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                list.add( -1);
            }
             else{
                 list.add(stack.peek());
             } 
             stack.push(arr[i]);
             
             
        }
         ArrayList<Integer>list2=new ArrayList<>();
         for(int i=list.size()-1;i>=0;i--)
         {
             list2.add(list.get(i));
         }
         return list2;
    }
     
}