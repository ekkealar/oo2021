package org.game;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest{
    static Main mang;
    @BeforeClass
    public static void init(){
        mang = new Main();
    }

    @Test
    public void firstTurn(){
        assertEquals("esimene käib peaks olema O", 'O', mang.getTurn());
    }

    @Test
    public void boardGame(){
        assertEquals("Mängulaua mõõdud peaks olema 9x6", 9, mang.getWidth());
        assertEquals("Mängulaua mõõdud peaks olema  9x6", 8, mang.getHeight());
    }
}
