/**
 * Recursive is a function calling itself until it reaches base case
 * whenever in java one function calling another function, it stored call stack which is present in heap memory;
 * 
 * Note: stackoverflow will occur more because if there is no base case on it
 */

package recursive;
public class multiple5 {
       public static void print(int num) {
            if(num<=0){
                return;
            }
            if(num%5==0){
                
                print(num-5);
                System.out.print(num +" ");
            }else{
                print(num-1);   
            }
            
        }
    
        public static void main(String args[]) {
            int num = 50;
            print(num);
        } 
}
