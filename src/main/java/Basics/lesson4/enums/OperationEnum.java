package Basics.lesson4.enums;

public enum OperationEnum {
    SUCCESS(1, "OK"),
    FAIL(0, "NOOK"),
    ERROR(-1, "Err");

    /*
    deklarujemy pola które będa posiadać enumy OperationEnum
     */
    private int code;

    private String codeDescription;

    /*
    tworzymy konstruktor
    alt + insert  lub ppm(prawy myszy) + Generate...
   jak widać IDE podpowiada nam pola do któruch będziemy się mogli odwołać potem
     */

    OperationEnum(int code, String codeDescription) {
        this.code = code;
        this.codeDescription = codeDescription;
    }
    /*
    aby móc się odwołać do pól potrzebne nam są gettery
         */

    public int getCode() {
        return code;
    }

    public String getCodeDescription() {
        return codeDescription;
    }
}
