package org.example.pattern.singleton;

public class Samosa {
    private static Samosa samosa;

    private Samosa(){

    }
    public static Samosa getSamosa(){
        if(samosa==null){
            synchronized (Samosa.class){
                samosa=new Samosa();
            }
        }
        return samosa;
    }
}
