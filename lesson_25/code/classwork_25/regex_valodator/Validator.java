package classwork_25.regex_valodator;



    public class Validator {
        public static void main(String[] args) {
            System.out.println(checkCreditCardNumber("12345678"));
            System.out.println(checkDateFormatEU("11.12.1996"));
            System.out.println(checkDateFormatUS("1996-12-05"));
            System.out.println(checkPhoneNumber( "+99(99)9999-9999"));
            System.out.println(checkLessEquals255(""));
        }

        // CreditCardNumber
        public static boolean checkCreditCardNumber(String str){
            return str.matches("\\d{8,16}");

        }

        //DateFormatEU - dd-MM-yyyy(?)
        public static boolean checkDateFormatEU(String str){

            String regex = "^\\d{2}\\.\\d{2}\\.\\d{4}$";
            return str.matches(regex);
        }

        // DateFormatUS - yyyy-MM-dd
        public static boolean checkDateFormatUS(String str){
           String regex = "^\\d{4}-\\d{2}-\\d{2}$";
            return str.matches(regex);
        }

        // PhoneNumber +99(99)9999-9999
        public static boolean checkPhoneNumber(String str){
            String regex = "^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$";
            return str.matches(regex);
        }

        // LessEquals255
        public static boolean checkLessEquals255(String str){
            String regex = "";
            return false;
        }


    }
