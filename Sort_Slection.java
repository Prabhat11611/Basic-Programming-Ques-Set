public class Sort_Slection {
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};

        // time complexity = O(n^2)
        // Selection sort

        for(int i=0; i<arr.length-1; i++){        // Outer loop will run till n-1.
            int smallest=i;

            for(int j=i+1; j<arr.length; j++){    // j is starting from i+1 because the ith index value is already smallest, or sorted.
                // In bubble sort the value of j<arr.length was getting decresed but now
                // in Selection sort our starting value (j=i+1) gets increased.

                // In bubble sort we were trying to put the haviour element at the back of the array thus reducing the size of an array which needs to be sorted further.
                // In Selection sort we are trying to put the lighter element ar the starting of the array thus reducing the size of an array which needs to be sorted further.

                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}

// In Bubble Sort, we do not do the swaping again and again. Here, we find the smallest element and do the swapping in single hit.
// Here, we do not do the unneccessary swaping, we do only one swapping in one iteration.
