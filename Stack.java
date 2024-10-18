package assignment6.ArrayStack;

import java.util.Scanner;

public class Stack {
    public static int top = -1;
    public static int stk[];
    Stack(int size){
        stk = new int[size];
        
    }
    public static boolean isEmpty(){
        if (top == -1) {
            return true;
        }
        else{
            return false;

        }
    }
    public static boolean isFull(){
        if (top == stk.length ) {
            return true ;
            
        }
        else{
            return false;
        }
    }
    void push(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element :");
        int item = sc.nextInt();
        if (isFull()) {
            System.out.println("Stack overLoad");
            
        }
        else{
            stk[++top] = item;
        }
        
        
    }
    void pop(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");;

        }
        else{
            System.out.println("\nPop element = "+stk[top--]);
        }
       
        
    }
    void Display(){
        for (int i = 0; i < stk.length; i++) {
            System.out.print(stk[i]+" ");
        }
    }
    void peek(){
        System.out.println("The top element = "+stk[top]);
    }
    
}
