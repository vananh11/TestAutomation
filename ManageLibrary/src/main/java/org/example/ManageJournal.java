package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class ManageJournal extends Managelibrary {
    public int NumberRelease;
    public int MonthRelease;


    public ManageJournal(String CodeDocument, String NamePublishing, int DeliveryNumber, int NumberRelease, int MonthRelease) {
        super(CodeDocument,NamePublishing,DeliveryNumber);
        this.NumberRelease = NumberRelease;
        this.MonthRelease = MonthRelease;
    }

    public int getNumberRelease() {
        return NumberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.NumberRelease = numberRelease;
    }

    public int getMonthRelease() {
        return MonthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.MonthRelease = monthRelease;
    }
}


