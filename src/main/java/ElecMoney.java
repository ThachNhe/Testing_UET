public class ElecMoney {
    public static double CalElecMoney(long numKWh) {
        long ElecMoneyTotal = 0;
        if(numKWh < 0  || numKWh > 20000) return -1;
            // Bậc 1: 0 đến 50 kWh
            if (numKWh <= 50) {
                ElecMoneyTotal = numKWh * 1806;
            }
            // Bậc 2: 51 đến 100 kWh
            else if (numKWh <= 100) {
                ElecMoneyTotal = 50 * 1806 + (numKWh - 50) * 1866;
            }
            // Bậc 3: 101 đến 200 kWh
            else if (numKWh <= 200) {
                ElecMoneyTotal = 50 * 1806 + 50 * 1866 + (numKWh - 100) * 2167;
            }
            // Bậc 4: 201 đến 300 kWh
            else if (numKWh <= 300) {
                ElecMoneyTotal = 50 * 1806 +  50 * 1866+ 100 * 2167 + (numKWh - 200) * 2729;
            }
            // Bậc 5: 301 đến 400 kWh
            else if (numKWh <= 400) {
                ElecMoneyTotal = 50 * 1806 + 50 * 1866 + 100 * 2167 + 100 * 2729 + (numKWh - 300) * 3050;
            }
            // Bậc 6: 401 kWh trở lên
            else {
                ElecMoneyTotal = 50 * 1806 + 50 * 1866 + 100 * 2167 + 100 * 2729 + 100 * 3050 + (numKWh - 400) * 3151;
            }
        return ElecMoneyTotal;
    }
}
