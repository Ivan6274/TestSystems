package ru.netology;




import static org.junit.Assert.assertEquals;

class CashbackHackServiceJUnitJupiterTest {
    @org.junit.jupiter.api.Test
    public void testRemainMin() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);

        int expected = 600;
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemainMiddle() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2400);

        int expected = 600;
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemainModNull() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);

        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemainMax() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(20000);

        int expected = 0;
        assertEquals(actual, expected);
    }

}