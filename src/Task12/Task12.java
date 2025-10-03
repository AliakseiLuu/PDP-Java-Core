package Task12;
        //Дана строка "Август, Сумма расходов равна, 0 ₽, Сумма доходов равна, 0 ₽"
        //Где Август - любой месяц, 0 - это суммы расходов / доходов. Сохранить в переменные значения расходов и доходов, вывести в консоль

public class Task12 {

    public static void main (String[] args){

        String inputStr = "Август, Сумма расходов равна, 0 ₽, Сумма доходов равна, 0 ₽";

        String[] parts = inputStr.split(",");

        String mounth = parts[0];
        String expenseStr = parts[2].trim().replace(" ₽", "");
        String incomStr = parts[4].trim().replace(" ₽", "");

        System.out.println("Mounths: " + mounth);
        System.out.println("Expense: " + expenseStr + "₽");
        System.out.println("Incom: " + incomStr+ "₽");
    }
}
