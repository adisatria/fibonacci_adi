/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jurnalganjil1;

import java.util.*;

public class Jurnalganjil1 {

    private int awal=0;
    private int tambahan=1;
    private int fibonacci;
    private int jumlah;
    private List<Integer> list=new ArrayList<Integer>();
    
     public Fibonacci(){
        list.add(0);
        list.add(1);
    }
     
     public List<Integer> getFibonacci(int limit){
        
        for(int i=0;i<limit;i++){
            fibonacci=tambahan+awal;
            awal=tambahan;
            tambahan=fibonacci;
            jumlah=fibonacci++;
            list.add(jumlah);
        }
        
        return list;
    }
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int in = input.nextInt();
        Jurnalganjil1 fibonacci=new Jurnalganjil1();
        List<Integer> list=fibonacci.getFibonacci(in);
        
        for(Integer jumlah:list){
            System.out.print(jumlah+", ");
        }
    }
    
}
