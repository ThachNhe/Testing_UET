import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class TestCase3 {

    @Test
    public void test1() {
        assertEquals(-1, ElecMoney.CalElecMoney(-10));
    }
    @Test
    public void test2() {
        assertEquals(54180, ElecMoney.CalElecMoney(30));
    }
    @Test
    public void test3() {
        assertEquals(135084, ElecMoney.CalElecMoney(74));
    }
    @Test
    public void test4() {
        assertEquals(291950, ElecMoney.CalElecMoney(150));
    }
    @Test
    public void test5() {
        assertEquals(564040, ElecMoney.CalElecMoney(260));
    }

    @Test
    public void test6() {
        assertEquals(840950, ElecMoney.CalElecMoney(355));
    }
    @Test
    public void test7() {
        assertEquals(1608400, ElecMoney.CalElecMoney(600));
    }

}
