/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class segment_tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SegTree st=new SegTree(n,arr);
        st.build();
        while(q>0){
            String s=sc.next();
            switch(s){
                case "q":
                    int l=sc.nextInt()-1;
                    int r=sc.nextInt()-1;
                    System.out.println(st.query(l, r));
                    break;
                case "u":
                    int ind=sc.nextInt()-1;
                    int val=sc.nextInt();
                    st.update(ind, val);
                    break;
            }
            
            q--;
        }
        
        
    }
    
}
    
class SegTree{
        int[] segtree;
        int n;
        int[] arr;

        public SegTree(int n, int[] arr) {
            this.n = n;
            this.arr = arr;
            segtree=new int[(2*n)+2];
        }

        public void build(){
            build(0,0,n-1);
            for(int i=0;i<n;i++)
                System.out.print(segtree[i]+" ");
            System.out.println();
        }
        public void update(int ind,int val){
            update(0,0,n-1,ind, val);
        }
        public int query(int l,int r){
            return query(0,0,n-1,l,r);
        }
        private int query(int node,int start,int end,int l,int r){
            if(r<start || end<l)
                return 0;
            if(l<=start && end<=r)
                return segtree[node];
            
                int mid=(start+end)/2;
                int x1=query((node*2)+1,start,mid,l,r);
                int x2=query((node*2)+2,mid+1,end,l,r);
                return x1+x2;
            
   
        }
        
        private void build(int node,int start,int end){
            if(start==end){
                segtree[node]=arr[start];
            }
            else{
                int mid=(start+end)/2;
                build((2*node)+1,start,mid);
                build((2*node)+2,mid+1,end);
                segtree[node]=segtree[(2*node)+1]+segtree[(2*node)+2];
            }
        }
         private void update(int node,int start,int end,int ind,int val){
             if(start==end){
                 segtree[node]=val;
                 arr[ind]=val;
             }else{
                 int mid=(start+end)/2;
                 update((2*node)+1,start,mid,ind,val);
                 update((node*2)+2,mid+1,end,ind,val);
                 segtree[node]=segtree[(2*node)+1]+segtree[(node*2)+2];
             }
         }
        
    }
    
    
    
