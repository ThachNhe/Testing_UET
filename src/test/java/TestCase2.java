import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class TestCase2 {

    @Test
    public void test1() {
        assertEquals(-1, ElecMoney.CalElecMoney(-5));
    }
    @Test
    public void test2() {
        assertEquals(-1, ElecMoney.CalElecMoney(100000));
    }
    @Test
    public void test3() {
        assertEquals(45150, ElecMoney.CalElecMoney(25));
    }
    @Test
    public void test4() {
        assertEquals(136950, ElecMoney.CalElecMoney(75));
    }
    @Test
    public void test5() {
        assertEquals(291950, ElecMoney.CalElecMoney(150));
    }

    @Test
    public void test6() {
        assertEquals(536750, ElecMoney.CalElecMoney(250));
    }
    @Test
    public void test7() {
        assertEquals(825700, ElecMoney.CalElecMoney(350));
    }

    @Test
    public void test8() {
        assertEquals(1293300, ElecMoney.CalElecMoney(500));
    }
}
