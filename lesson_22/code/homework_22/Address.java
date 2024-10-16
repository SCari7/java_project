package homework_22;

public class Address {
    private String city;
    private String postalCode;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public Address(String city, String postalCode) {

        if (Character.isUpperCase(city.charAt(0))){
            this.city = city;
        }else {
            System.out.println("Название должно быть с большой буквы");
            this.city = "Wrong input";
        }
/*
Метод .matches() в Java используется для проверки строки на
соответствие регулярному выражению (регулярному шаблону).
 В данном случае:
postalCode.matches("\\d{5}")
Этот метод проверяет, состоит ли строка postalCode
строго из пяти цифр.
Объяснение выражения \\d{5}:
\\d — это регулярное выражение для обозначения цифры (0-9).
 Поскольку в Java обратный слэш (\) используется как символ экранирования,
  его нужно удвоить, чтобы обозначить именно символ регулярного
  выражения. Поэтому пишется \\d.
{5} — это указание количества символов.
В данном случае оно означает ровно 5 цифр.
Итак, postalCode.matches("\\d{5}") проверяет,
соответствует ли строка индекса postalCode шаблону,
 который состоит из ровно 5 цифр. Если строка соответствует,
  метод возвращает true; если нет — false.
 */
        //  проверка индекса на 5 символов
        if (postalCode.length() == 5 && postalCode.matches("\\d{5}")){
            this.postalCode = postalCode;
        }else {
            System.out.println("Индекс должен содержать 5 цифр");
            this.postalCode = "Wrong input";
        }

    }

}
