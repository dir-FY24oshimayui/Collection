package sample;

import java.lang.invoke.VarHandle;

public class ArraySample {

    public static void main(String[] args) {
        var numbers=new int[5];
        
        for(var i=0; i<numbers.length; i++) {
            numbers[i]=i*2;//各配列の各要素に値を代入
        }

    }

}
