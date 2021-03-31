package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class ManaManageNewspaper extends Managelibrary {
    public int DayRelease;

    public ManaManageNewspaper(String CodeDocument, String NamePublishing, int DeliveryNumber, int DayRelease) {
        super(CodeDocument,NamePublishing,DeliveryNumber);
        this.DayRelease = DayRelease;
    }

    public int getDayRelease() {
        return DayRelease;
    }

    public void setDayRelease(int dayRelease) {
        DayRelease = dayRelease;
    }
}
