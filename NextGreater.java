import java.util.Stack;
import java.util.ArrayList;

public class NextGreater {

    static ArrayList<Integer>nextGreater(int[] arr){

      Stack<Integer> s = new Stack<>();
      ArrayList<Integer> res = new ArrayList<>();  
      
      for(int i=0;i<arr.length;i++){
        res.add(-1);
      }    

      for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && s.peek()<arr[i]){
            s.pop();
        }

      if(!s.isEmpty()){
        res.set(i,s.peek());

      }
      s.push(arr[i]);
      }
      return res;
    }
    public static void main(String[] args) {
        
        int[] arr= {6,8,0,1};
        ArrayList<Integer> res = nextGreater(arr);
        for(int x:res){
            System.out.println(x);
        }
    }
    
}
