public class xulimang {
    public int[] insert(int []arr,int n, int index,int value){
        for(int i= arr.length-1;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        return arr;
    }
    public int[] delete(int []arr,int n, int index){
        for(int i= index; i<n-1;i++){
            arr[i] = arr[i+1];
        }
        return arr;
    }
    public int [] sx(int [] arr, int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n; j++) {
                if(arr[i]<arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }
}
