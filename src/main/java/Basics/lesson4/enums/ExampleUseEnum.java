package Basics.lesson4.enums;
// Statyczny import dla enum, dzięki niemu nie musimy pisać przedrostka OperationEnum.

import static Basics.lesson4.enums.OperationEnum.ERROR;
import static Basics.lesson4.enums.OperationEnum.SUCCESS;

public class ExampleUseEnum {
    public static void main(String[] args) {

        OperationEnum operation1 = OperationEnum.SUCCESS;
        OperationEnum operation2 = OperationEnum.FAIL;
        OperationEnum operation3 = ERROR;

        /*
        po dodaniu statycznego importu możemu zredukować tekst przykład z ERROR
         */

        System.out.println("operacja 1: " + operation1);
        System.out.println("operacja 2: " + operation2);
        System.out.println("operacja 3: " + operation3);

        OperationEnum[] operations = OperationEnum.values();

        // OperationEnum operation4 = OperationEnum.valueOf("Success");
        OperationEnum operation5 = OperationEnum.valueOf("SUCCESS");

        System.out.println(operation5 + "  <- to jest operation5");


        /*
        przykład wykorzystania zmiennych z enuma
         */

        System.out.println("Operacja1: " + SUCCESS + "\n" +
                "kod: " + SUCCESS.getCode() + "\n" +
                "opis: " + SUCCESS.getCodeDescription());


        /*
        jak sprawdzić po kodzie błedu jaki mamy enum? należy pobrać tablice wartości
        i przeiterować ją sprawdzając czy wartość się zgadza
         */

        for (OperationEnum value : OperationEnum.values()) {
            if(value.getCode() == 1){
                System.out.println(value);
            }

        }

   }
}
