package hellowaorldcom.company;

public class MergeSort {
    public static void main(String args[]){
        int []arr={10,9,5,2,1,6};
        System.out.println("Array Before");
        for(int x:arr) {
            System.out.print(x + " ");
        }
            System.out.println("\nSorted Array");
            mergeSort(arr,0,arr.length-1);
            for(int y:arr){
                System.out.print(y +" ");
            }
        }
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            // for left
            mergeSort(arr,left,mid);
            // for right
            mergeSort(arr,mid+1,right);
            // combine
            merge(arr,left,mid,right);

        }

        }
    public static void merge(int[] arr,int left,int mid ,int right){
        int i=left;
        int j=mid+1;
        int k=0;
        int [] temp=new int[right-left+1];
        while(i <=mid && j <= right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
        for(i=left,k=0;i<=right;i++,k++){
            arr[i]=temp[k];
        }
    }
    }

