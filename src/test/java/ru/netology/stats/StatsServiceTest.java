package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSales = 180;
        long actualSales = (long) service.getSumSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
        System.out.println("Cумма всех продаж = " + actualSales);
        System.out.println();

    }

    @Test
    public void AverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSales = (long) service.getAverageSales(sales);
        System.out.println("Средняя сумма продаж в месяц = " + actualSales);
        System.out.println();
    }

    @Test
    public void MinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSales = (long) service.getMinSales(sales);
        System.out.println("Номер месяца с минимальной суммой продаж = " + actualSales);
        System.out.println();
    }

    @Test
    public void MaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSales = (long) service.getMaxSales(sales);
        System.out.println("Номер месяца с максимальной суммой продаж = " + actualSales);
        System.out.println();
    }

    @Test
    public void quantityBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSales = (long) service.quantityBelowAverageSales(sales);
        System.out.println("Количество месяцев с суммой продаж ниже среднего = " + actualSales);
        System.out.println();

    }

    @Test
    public void quantityAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSales = (long) service.quantityAboveAverageSales(sales);
        System.out.println("Количество месяцев с суммой продаж выше среднего = " + actualSales);
        System.out.println();

    }


}
