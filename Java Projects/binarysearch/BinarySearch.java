
package binarysearch;

import java.util.Scanner;


public class BinarySearch {

    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int[] array = {9,11,13,15,16,17,19,21,22,23};
        
        for(int x = 0; x<array.length; x++){
            System.out.print(array[x] + "  ");
        }
        System.out.println("\nPick a number in the range");
        
        int input = scnr.nextInt();
        int index = binarySearch(array,input,0, array.length);
        
        if(index!=-1){
        System.out.println("Your input is located on index: "+ (index+1));
        }
        else{
            System.out.println("Input not in range");
        }
        
        Circle1[] arrayc = new Circle1[10];
        for (int i = 0; i < array.length; i++) {
            arrayc[i] = new Circle1(5 + i); // Circles with increasing radii
        }

        for (int x = 0; x<array.length - 1; x++) {
            System.out.print(arrayc[x].getRadius() + "  ");
        }
        System.out.println("\nPick a number in the range:");

        double inputc = scnr.nextDouble();
        Circle1 circle = new Circle1(inputc);
        int indexc = binarySearch(arrayc, circle, 0, array.length - 1);

        if (indexc != -1) {
            System.out.println("Your input is located at index: " + (index + 1));
        } else {
            System.out.println("Input not in range");
        }
    }
    
    public static int binarySearch(Circle1[] array,Circle1 key, int low, int high){
        
    int rangeSize = (high-low) + 1;
    
    int mid = low + (high-low)/2;
    
    if(array[mid].compareTo(key)==0) return mid;
    else if(rangeSize==1) return -1;
    
    if(array[mid].compareTo(key)<0) return binarySearch(array, key, mid+1, high);
    else return binarySearch(array, key, low, mid-1);
    
    
}
    
    public static int binarySearch(int[]A,int key, int low, int high){
        
    int rangeSize = (high-low) + 1;
    
    int mid = (high+low)/2;
    
    if(key==A[mid]) return mid; //found it, no further recursion needed
    else if(rangeSize==1)return -1; //not in array
    
    if(key<A[mid]) return binarySearch(A,key,low,mid);
    else return binarySearch(A,key,mid+1,high);
    
}
    
}
