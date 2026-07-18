class Solution {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public void moveZeroes(int[] arr) {
        int n = arr.length ;
        print(arr);
        for(int i =0 ; i<n ; i++){
            int swap=0;
            for(int j = 0 ; j < n-1-i ; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++ ;
                }
               
            }
            if(swap==0) break;
        }
        print(arr);

        
    }
    
}