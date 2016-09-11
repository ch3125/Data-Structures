/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackarraylist;

import java.util.ArrayList;

 class Stack<T> {
     private ArrayList<T> arr;
     public Stack(){
         arr=new ArrayList<T>();
     }
     public void push(T ob){
        arr.add(ob);
    }
    public T pop(){
        return arr.remove(arr.size()-1);
    }
    public T peek(){
        return arr.get(arr.size()-1);
    }
   
}
    public class StackArrayList{
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> stacky=new Stack<>();
        stacky.push(10);
        stacky.push(9);
        stacky.push(8);
        stacky.push(7);
        stacky.push(5);
        stacky.push(3);
        stacky.push(2);
        stacky.push(1);
        System.out.println(stacky.pop());
            System.out.println(stacky.pop());
               System.out.println(stacky.pop());
                  System.out.println(stacky.pop());
                     System.out.println(stacky.pop());
                     System.out.println(stacky.peek());
        
        
        
    };
        
    }
    

