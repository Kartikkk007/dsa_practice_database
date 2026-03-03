
   /* class NextGreatest {
    static void nextGreatest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        
        System.out.println("Second greatest element: " + max2);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        nextGreatest(arr);
    }
}
*/
class SecondGreatest{

 static void secondGreatest(int[] arr) {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for(int num:arr){
        if(num>first){
            second= first;
            first = num;
        }
        if(num>second && num!=first){
            second=num;

        }

    }
       System.err.println("second greatest element : "+second);


}
   public static void main(String[] args) {
    int[] arr = {2,3,5,6,3};
    secondGreatest(arr);
   }
}