package src.main.java.dz12_Lesson23PriceInWords.services;

public class Validator {
    public static boolean check(String value){
        if (value.contains(" ")){
            String[] parametrs = value.split(" ");
            try {
                int i = Integer.parseInt(parametrs[0]);
            } catch (NumberFormatException e2){
                System.out.println("Ошибка_2. Неверное первое значение. Должно быть целое число от -2 147 483 648 до 2 147 483 647.");
                    return false;
            }
            try {
                String currencyCode = parametrs[1];
                Currency instance = Currency.valueOf(currencyCode);
            } catch (NumberFormatException e3) {
                System.out.println("Ошибка_3. Неверно второе значение.");
                return false;
            }
        } else {
            System.out.println("Ошибка_1. Необходимо вводить два значения (Пример: 2 RUS).");
            return false;
        }
        return true;
    }
}

