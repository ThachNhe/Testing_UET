import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class TestCase1 {

    @Test
    public void test1() {
        assertEquals(0, ElecMoney.CalElecMoney(0));
    }
    @Test
    public void test2() {
        assertEquals(62737800, ElecMoney.CalElecMoney(20000));
    }
    @Test
    public void test3() {
        assertEquals(1806, ElecMoney.CalElecMoney(1));
    }
    @Test
    public void test4() {
        assertEquals(31227800, ElecMoney.CalElecMoney(10000));
    }
    @Test
    public void test5() {
        assertEquals(62734649, ElecMoney.CalElecMoney(19999));
    }

    @Test
    public void test6() {
        assertEquals(62737800, ElecMoney.CalElecMoney(20000));
    }
}
