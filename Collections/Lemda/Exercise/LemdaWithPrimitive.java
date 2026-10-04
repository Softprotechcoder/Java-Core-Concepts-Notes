package Collections.Lemda.Exercise;

import java.util.function.*;

public class LemdaWithPrimitive {
    public static void main(String[] args){
        System.out.println("Welcome to Premitive Lemda Interfaces");
        // Premitive Function Exapmple will take int --> R (Object)
        IntFunction <Integer> pf = x -> x+5;
        System.out.println(pf.apply(7));

        ToIntFunction<Integer> toInt = ptf -> ptf -5;
        System.out.println(toInt.applyAsInt(9));

        LongFunction <Long> toLongObj = l -> l;
        Long result = (toLongObj.apply(98787875788754678l));

        ToLongFunction<Long> tolong = x -> x;
        System.out.println("Apply as Long : "+tolong.applyAsLong(result));

    }

    
}
