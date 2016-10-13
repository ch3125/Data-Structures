/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie;

import java.util.HashMap;
import java.util.Scanner;


class Tries
{
    private class TrieNode{
    HashMap<Character,TrieNode> children;
    boolean endOfWord;
    TrieNode(){
        children=new HashMap<>();
               endOfWord=false; 
    }
}

   private final TrieNode root;
   public Tries(){
       root=new TrieNode();
   }
   public void insert(String word){
       TrieNode current=root;
       for(int i=0;i<word.length();i++){
           char ch=word.charAt(i);
           TrieNode node=current.children.get(ch);
           if(node==null){
               node=new TrieNode();
               current.children.put(ch,node);
           }
           current=node;
       }
       current.endOfWord=true;
   }
   public boolean search(String word){
       TrieNode current=root;
       int flag=0;
       for(int i=0;i<word.length();i++){
           char ch=word.charAt(i);
       TrieNode node=current.children.get(ch);
       if(node==null){
           flag=1;
           break;
       }
       
       current=node;           
           }
       
        return flag==0;
       }
}

   
   public class Trie{
   
    public static void main(String[] args) {
        // TODO code application logic here
        Tries tx=new Tries();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation to be performed");
         System.out.println("1.Insert");
          System.out.println("2.search");
          while(sc.hasNext()){
        int c=sc.nextInt();
        switch(c){
            case 1:
                tx.insert(sc.next());
                break;
            case 2:
                System.out.println(tx.search(sc.next()));
        }
        
    }
    }
   }
    
   

