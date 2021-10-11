package com.company;


class Multithread extends Thread{
    public void run()
    {
        try{
            System.out.println("Thread get ID" +Thread.currentThread().getId());
        }
        catch (Exception e) {
            System.out.println("Exception is caught");  //throwing an exception
        }
    }
}
public class Main{
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n; i++)
        {
            Multithread object=new Multithread();
            object.start();
        }
    }
}
