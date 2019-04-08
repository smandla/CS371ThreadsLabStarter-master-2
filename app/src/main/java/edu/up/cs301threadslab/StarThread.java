package edu.up.cs301threadslab;

import android.util.Log;

import java.util.Random;

public class StarThread extends Thread {
    StarAnimation starAnimation;

    public StarThread(StarAnimation starAnimation){
        this.starAnimation = starAnimation;
    }

    @Override
    public void run(){
        Random random = new Random();
        try{
            while (true){
                Thread.sleep(2);
                if(random.nextBoolean()){
                    starAnimation.addStar();
                }
                else{
                    starAnimation.removeStar();
                }
            }
        } catch(Exception e){
            Log.e("StarThread", "run: Invalidate", e);
        }
    }
}
