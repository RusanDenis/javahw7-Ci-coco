package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}
//создаем переменную курет, она равна первому массиву
// каждая последующая переменаа инкомет равноа следующему значению следующего массива
//если перенная курет меньше инкома, то курет принимает значение инкома
// возвращаем максимальное значение, т е переменную курет