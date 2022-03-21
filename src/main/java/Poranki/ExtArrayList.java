package Poranki;

import java.util.ArrayList;
import java.util.Iterator;

public class ExtArrayList extends ArrayList {

    public String toString() {

        String info = new String();
        String type = this.get(0).getClass().getSimpleName();
        info = "Lista przechowuje dane typu " + type;

        for (int i = 0; i < this.size(); i++) {
            info = "index=" + i + " wartość=" + this.get(i);
        }
        return info.toString();
    }

    public boolean remove(Object a) {
        if (a == null) {
            return false;
        }

        for (int i = 0; i < this.size(); i++) {
            if ((a.equals(this.get(i)))) {
                this.set(i, null);
            }
        }
        return false;
    }
}
