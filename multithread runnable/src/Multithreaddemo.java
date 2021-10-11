package com.company;

class MultithreadingDemo extends Thread {
    public void run()
    {
        try {   //displaying thread that is running
            System.out.println(
                    "Thread Get ID" + Thread.currentThread().getId()
                            + "is running"); }
        catch (Exception e) {
            System.out.println("Exception is caught"); //Throwing an exception
        }
    }
}
class Main {
    public static void main(String[] args)
    {
        int n=10;
        for (int i=0; i<n; i++){
            Thread object = new Thread (new MultithreadingDemo());
            object.start();
        }
    }
}