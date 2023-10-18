import java.util.*;
public class Bubble {
  
    public void sort(int a[]){
        int i=0,j=0;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-i-1;j++){
                if(a[j+1]>a[j]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(i=0;i<a.length;i++){
            System.out.print("\n"+a[i]+" ");
        }

    }
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }            
        
        Bubble obj=new Bubble();
        obj.sort(a);
    }
}
