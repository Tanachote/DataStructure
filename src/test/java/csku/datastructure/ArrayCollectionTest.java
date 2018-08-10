package csku.datastructure;

/**
 * Created by 708 on 8/10/2018.
 */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCollectionTest {

    @Test
    public void testSizeZero() {
        ArrayCollection arrayC = new ArrayCollection(10);
        assertEquals(0, arrayC.size());
        arrayC.size();
        arrayC.add("BANGKOK");
        arrayC.add("PHUKET");
        arrayC.add("BANGKOK");
        arrayC.add("SONGKLA");
        System.out.println(arrayC.size());
        arrayC.remove("PHUKET");
    }
}
