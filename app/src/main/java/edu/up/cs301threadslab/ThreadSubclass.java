package edu.up.cs301threadslab;

import android.util.Log;

public class ThreadSubclass extends Thread {
    AnimationView animationView;

    public ThreadSubclass(AnimationView animationView){
        this.animationView = animationView;
    }

    @Override
    public void run(){
        try{
            while (true) {
                animationView.postInvalidate();
                Thread.sleep(50);
            }
        } catch (Exception e){
            Log.e("ThreadSubclass", "run: Invalidate", e);
        }
    }
}
