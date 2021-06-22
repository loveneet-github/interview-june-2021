package exam;
import java.util.Scanner; 
public class ShiftElementsInArray {

  public static void main(String[] args) {
    int n=1;
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=sc.nextInt();  
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
array[i]=sc.nextInt();  
}  
             int m = 1;        
        System.out.println("Original array: ");    
        for (int i = 0; i < array.length; i++) {     
            System.out.print(array[i] + " ");     
        }     
        for(int i = 0; i < m; i++){    
            int j, last;        
            last = array[array.length-1];     
            for(j = array.length-1; j > 0; j--){      
                array[j] = array[j-1];    
            }      
            array[0] = last;    
        }   
        System.out.println();    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< array.length; i++){    
            System.out.print(array[i] + " ");    
        }    
    }

}


