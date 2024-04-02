import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase4 {
    // test case of var numKwh
    @Test
    public void test1() {
        assertEquals(81270, ElecMoney.CalElecMoney(45));
    }
    @Test
    public void test2() {
        assertEquals(146280, ElecMoney.CalElecMoney(80));
    }
    @Test
    public void test3() {
        assertEquals(326622, ElecMoney.CalElecMoney(166));
    }
    @Test
    public void test4() {
        assertEquals(553124, ElecMoney.CalElecMoney(256));
    }
    @Test
    public void test5() {
        assertEquals(844000, ElecMoney.CalElecMoney(356));
    }

    @Test
    public void test6() {
        assertEquals(6019800, ElecMoney.CalElecMoney(2000));
    }
    @Test
    public void test7() {
        assertEquals(-1, ElecMoney.CalElecMoney(-45));
    }
    @Test
    public void test8() {
        assertEquals(72240, ElecMoney.CalElecMoney(40));
    }
    @Test
    public void test9() {
        assertEquals(178002, ElecMoney.CalElecMoney(97));
    }
    @Test
    public void test10() {
        assertEquals(398133, ElecMoney.CalElecMoney(199));
    }
    @Test
    public void test11() {
        assertEquals(670471, ElecMoney.CalElecMoney(299));
    }
    @Test
    public void test12() {
        assertEquals(975150, ElecMoney.CalElecMoney(399));
    }

    @Test
    public void test13() {
        assertEquals(39732, ElecMoney.CalElecMoney(22));
    }
    @Test
    public void test14() {
        assertEquals(161208, ElecMoney.CalElecMoney(88));
    }
    @Test
    public void test15() {
        assertEquals(374296, ElecMoney.CalElecMoney(188));
    }
    @Test
    public void test16() {
        assertEquals(645910, ElecMoney.CalElecMoney(290));
    }
    @Test
    public void test17() {
        assertEquals(947700, ElecMoney.CalElecMoney(390));
    }
    @Test
    public void test18() {
        assertEquals(3218561, ElecMoney.CalElecMoney(1111));
    }
    // test case of var ElecMoneyTotal
    @Test
    public void test19() {
        assertEquals(2868800, ElecMoney.CalElecMoney(1000));
    }

    @Test
    public void test20() {
        assertEquals(1806, ElecMoney.CalElecMoney(1));
    }
    @Test
    public void test21() {
        assertEquals(92166, ElecMoney.CalElecMoney(51));
    }

    @Test
    public void test22() {
        assertEquals(185767, ElecMoney.CalElecMoney(101));
    }
    @Test
    public void test23() {
        assertEquals(403029, ElecMoney.CalElecMoney(201));
    }
    @Test
    public void test24() {
        assertEquals(676250, ElecMoney.CalElecMoney(301));
    }

    @Test
    public void test26() {
        assertEquals(4444300, ElecMoney.CalElecMoney(1500));
    }

}
