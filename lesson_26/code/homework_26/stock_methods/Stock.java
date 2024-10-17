package homework_26.stock_methods;

import homework_26.detail.Detail;

/*
Интерфейс Stock c методами:

добавить деталь на склад
найти деталь по barCode
обновить данные о детали
удалить деталь
общая масса всех деталей на складе
средняя масса деталей на складе
 */
public interface Stock {
    boolean addDetail (Detail detail);
    Detail findDetail (long barCode);
    Detail upDateDetail (Detail detail);
    Detail removeDetail(long barCode);
    double totalWeight();
    double averageWeight();

}
