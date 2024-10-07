package lesson_16;

public class magicArray {
    int[] array;
    int cursor; //присвоено значение по умолчанию = 0;

    public magicArray() {
        array = new int[10];
    }

    // Добавление в массив одного элемента
    void add(int value) {
// Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            expanceArray();

        }
        array[cursor] = value;
        cursor++;
    }

    void add(int... numbers) {
        // с numbers я могу обращаться точно также,
        // как со ссылкой на массив int
        // System.out.println("Приняли несколько интов.
        // А именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве.
        // По индексом 0: " + numbers[0]);

//        System.out.println("ints, = " + numbers.length);
//        System.out.println(numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);

        }
    }// Динамическое расширение массива

    void expanceArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);

        /*
        1. создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */


        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];


        }
        // Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива
    // [1, 14, 16]
    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]");


        }
        return result;
    }

    // Текущее количество элементов в массиве
    int seize() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >= 0 && index > cursor) {
            return array[index];
        }
        // Написать код, если индекс "не корректный"
        return Integer.MIN_VALUE;// Хорошего решения нет
        //Todo поправить обработку не корректного индекса
    }

    // Удаление элемента по индексу
    int remove(int index) {
        if (index < 0 || index >= cursor) {

        }
        return -1;
    }
//        int removedValue = array[index];
//        for (int i = index; i < cursor -1 ; i++) {
//            array[i] = array[i + 1];
//
//        }
//        cursor --;
//        return removedValue;
//
//    }



    /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */
        //Todo реализовать

    }