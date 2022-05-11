package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void example01() {
        assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 5);
    }

    @Test
    void example02() {
        assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
    }
    @Test
    void custom01() {
        assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{1, 2}), 1);
    }
}