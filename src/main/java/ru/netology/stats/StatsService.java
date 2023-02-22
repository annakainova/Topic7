package ru.netology.stats;

public class StatsService {

    public int getAllSalesSum(long[] sales) {
        int sum = 0; // sum for all sales

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int getAverageSales(long[] sales) {
        int sum = 0; // sum for all sales
        int average = 0; // average for all sales

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        average = sum / sales.length;
        return average;
    }

    public int getMonthsCountSalesLowerThanAverage(long[] sales) {
        int monthsCount = 0; // counter
        int average = getAverageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsCount++;
            }
        }
        return monthsCount;
    }

    public int getMonthsCountSalesHigherThanAverage(long[] sales) {
        int monthsCount = 0; // counter
        int average = getAverageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsCount++;
            }
        }
        return monthsCount;
    }

    public int getMonthMinSales(long[] sales) {
        int minMonth = 0; // month's number with minimal sales

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getMonthMaxSales(long[] sales) {
        int maxMonth = 0; // month's number with max sales

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
}
