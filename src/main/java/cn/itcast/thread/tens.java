package cn.itcast.thread;

/**
 * @author: cdf
 * @create: 2019-12-10 09:08
 **/
public class tens implements Runnable{


    @Override
    public void run() {
        for(int i=5;i>=0;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
