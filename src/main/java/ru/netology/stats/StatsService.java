package ru.netology.stats;

public class StatsService {
    public long getSumSales(long[] sales) {
        long sum = 0;
        for (long element : sales) {
            sum += element;
        }
        return sum;
    }

    public long getAverageSales(long[] sales) {
        long average = getSumSales(sales) / sales.length;//средняя сумма продаж в месяц
        return average;
    }

    public long getMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long getMaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long quantityBelowAverageSales(long[] sales) {
        long average = getAverageSales(sales); // //средняя сумма продаж в месяц
        int quantityBelowAverage = 0; // счётчик количества месяцев продаж ниже среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) { // значит, в рассматриваемом i-м месяце продажи ниже среднего
                quantityBelowAverage++; //Счетчик месяцев увеличивается
            }
        }

        return quantityBelowAverage;
    }

    public long quantityAboveAverageSales(long[] sales) {
        long average = getAverageSales(sales); // //средняя сумма продаж в месяц
        int quantityAboveAverage = 0; // счётчик количества месяцев продаж выше среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) { // значит, в рассматриваемом i-м месяце продажи выше среднего
                quantityAboveAverage++; //Счетчик месяцев увеличивается
            }
        }

        return quantityAboveAverage;
    }


}
