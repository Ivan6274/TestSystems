package ru.netology;




import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemainMin() {
        CashbackHackService service = new CashbackHackService();
        int actual  = service.remain(400);

        int expected = 600;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemainMiddle() {
        CashbackHackService service = new CashbackHackService();
        int actual  = service.remain(2400);

        int expected = 600;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemainModNull() {
        CashbackHackService service = new CashbackHackService();
        int actual  = service.remain(2000);

        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemainMax() {
        CashbackHackService service = new CashbackHackService();
        int actual  = service.remain(20000);

        int expected = 0;
        assertEquals(actual,expected);
    }
}