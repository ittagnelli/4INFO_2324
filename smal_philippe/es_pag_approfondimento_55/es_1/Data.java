public class Data {
    private int day;
    private int month;
    private static int[][] mesi_giorni = {
        {1, 31},
        {2, 28},
        {3, 31},
        {4, 30},
        {5, 31},
        {6, 30},
        {7, 31},
        {8, 31},
        {9, 30},
        {10, 31},
        {11, 30},
        {12, 31}
    };
    private static int giorni_tot = 365;

    public Data(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    private boolean checkDayofMonth() {
        if(((month == mesi_giorni[0][0]) || (month == mesi_giorni[2][0]) || (month == mesi_giorni[4][0]) ||
            (month == mesi_giorni[6][0]) || (month == mesi_giorni[7][0]) || (month == mesi_giorni[9][0]) || 
            (month == mesi_giorni[11][0])) && (day < mesi_giorni[0][1])) return true;
        else if(((month == mesi_giorni[3][0]) || (month == mesi_giorni[5][0]) || (month == mesi_giorni[8][0]) || 
                (month == mesi_giorni[10][0])) && (day < mesi_giorni[3][1])) return true;
        else if((month == mesi_giorni[4][0]) && (day < mesi_giorni[4][1]))return true;
        else return false;
    }

    public void nextDay() {
        if(checkDayofMonth()) day ++;
        else day = 1;
    }

    public void nextMonth() {
        if(month < 12) month ++;
        else month = 1;
    }

    public boolean isEqual(Data date) {
        return ((date.getDay() == day) || (date.getMonth() == month));
    }

    public int giorniDalinizioAnno() {
        int giorni = 0;

        for(int i = 0; i < mesi_giorni.length; i++) {
            if(mesi_giorni[i][0] < month) giorni += mesi_giorni[i][1];
        }

        return giorni;
    }

    public int giorniAfineAnno() {
        return giorni_tot - giorniDalinizioAnno();
    }   

    public String toString() {
        return "\n data : " + day + " / " + month;
    }
}
