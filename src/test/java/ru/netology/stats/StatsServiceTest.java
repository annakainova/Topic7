package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testGetAllSalesSum() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 180;
        int actual = service.getAllSalesSum(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testGetAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 15;
        int actual = service.getAverageSales(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testGetMonthsCountSalesLowerThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actual = service.getMonthsCountSalesLowerThanAverage(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testGetMonthsCountSalesHigherThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actual = service.getMonthsCountSalesHigherThanAverage(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testGetMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 9;
        int actual = service.getMonthMinSales(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testGetMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 8;
        int actual = service.getMonthMaxSales(sales);
        Assertions.assertEquals(actual, expected);
    }
}
