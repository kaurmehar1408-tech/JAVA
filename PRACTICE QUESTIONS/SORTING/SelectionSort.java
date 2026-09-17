public class SelectionSort{
    public static void selection(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){  // checks one by one element
            int minindex = i;  // assuming the current element is minimum
            for(int j=i+1;j<n;j++){    // performing checks of i with the rest of he array
                if(arr[j]<arr[minindex]){       // if found
                    minindex = j;        // replace it with the current minimum
                }
                if(minindex != i){         // avoids swapping if the current element is minimum
                    int temp = arr[i]; 
                    arr[i] = arr[minindex];
                    arr[minindex] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,8,6,3,9,2};
        selection(arr);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}