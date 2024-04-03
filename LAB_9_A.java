package JAVA_PROGRAMES;

public class LAB_9_A {
    public static void main(String[] args) {
        MyThread t1 =new MyThread();
        MyThread2 t2 =new MyThread2();
        t1.start();
        t2.start();

        
    }
}

class MyThread extends Thread{
     public void run(){
        for(int i=0;i>0;i++){
            System.out.println("Good Morning Guys");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
               e.printStackTrace();
            }
            setPriority(10);
        }
     }
}

class MyThread2 extends Thread{
    public void run(){
       for(int i=0;i>0;i++){
           System.out.println("Good night Guys");
           try {
               Thread.sleep(3000);
           } catch (Exception e) {
              e.printStackTrace();
           }
           setPriority(5);
       }
    }
}

