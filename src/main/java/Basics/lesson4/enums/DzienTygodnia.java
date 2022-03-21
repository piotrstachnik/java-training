package Basics.lesson4.enums;

public enum DzienTygodnia {
    PONIEDZIALEK(1, false),
    WTOREK(2, false),
    SRODA(3, false),
    CZWARTEK(4, false),
    PIATEK(5, false),
    SOBOTA(6, true),
    NIEDZIELA(7, true);

    private final int numeric;

    private final boolean weekend;

    DzienTygodnia(int numeric, boolean weekend) {
        this.numeric = numeric;
        this.weekend = weekend;
    }

    public int getNumeric() {
        return numeric;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public DzienTygodnia nastepnyDzienTygodnia() {
        int numerNastepnego = this.getNumeric() + 1;
        if (numerNastepnego > 7) {
            numerNastepnego -= 7;
//            numerNastepnego = numerNastepnego - 7;
        }
        for (DzienTygodnia value : DzienTygodnia.values()) {
            if(value.getNumeric() == numerNastepnego) {
                return value;
            }
        }
        return null;
    }
}
