package lesson_15;

public class Cat {
    public String name;
    public String color;
    public int age;

    //конструктор класса...специальный тип метода основная задача установить начальное значение своойств объекта
    /*
    1 имя совпадает с именем класса
    2 не имеет возвращаемого типа
    конструктор вызывается автоматически при созздании объекта
    перегрузка конструкторов с одинаковым названием с разными параметрами

     */
    // konstruktor
    public Cat(String catName){
        name = catName;


    }
    // konstruktor po umolchaniy
    public Cat(){

    }
    public Cat (String catName, String color){
        name = catName;
        this.color = color;


        // this используется в нутри класса для ссылки на текущий объект оно поможет для уборки конфликта между полями и параметрами метода

    }
    public Cat (String name, String color, int age){
        this(name, color); //должна быть вызвана первой
        /*
        вызов конструктора класса принимающий две стринги
        ключевое слово зыс может быть тспользована для другого конструктора
         */
//        this.name = name;
        this.age = age;
//        this.color = color; 
    }

    public void sleep() {
        System.out.println("я сплю");
    }

    public void ran() {
        System.out.println("ran!");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }
    public void whoAm (){
        System.out.printf("im cat: %s, my ge: %d, my color: %s\n",name, age, color);
    }


}
