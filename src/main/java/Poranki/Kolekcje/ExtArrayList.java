package Poranki.Kolekcje;

import java.util.ArrayList;

public class ExtArrayList extends ArrayList {

    public String toString() {

        String type = this.get(0).getClass().getSimpleName();
        String info = "Lista przechowuje dane typu " + type + "\n";

        for (int i = 0; i < this.size(); i++) {
            info = info + "index=" + i + " wartość=" + this.get(i) + "\n";
        }
        return info.toString();
    }

    public boolean remove(Object o) {
        if (o == null) {
            return false;
        }

        for (int i = 0; i < this.size(); i++) {
            if (o.equals(this.get(i))) {
                this.set(i, null);
                return true;
            }
        }
        return false;
    }
}
