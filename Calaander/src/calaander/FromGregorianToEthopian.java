package calaander;

import java.util.Scanner;

public class FromGregorianToEthopian {

    int date, month, theYear;
    static int ethMonth;
    static int ethYear;
    static int ethDate = 0;

    public FromGregorianToEthopian(int date, int month, int theYear) {
        this.date = date;
        this.ethYear = theYear;
        this.ethMonth = month;

    }

    public String conversion(int date, int month, int theYear) {

        if (month <= 8) {// from january-ougest
            month += 4;
        } else {//from sep-december
            month -= 8;
        }
        if (month <= 4) {//this means if the month is between september and december 
            ethYear = theYear - 7;
        } else {//starting from january
            ethYear = theYear - 8;
        }

        //ethDate=date=date-(10-month+y);
        //this is to identify the month
 Eotc eoo = new Eotc(ethYear);

        switch (month) {
            case 1://meskerem
                if (eoo.wongelawi().equals("Yohannes")) { //leap year
                    ethDate = date - 11;
                } else {
                    ethDate = date - 10;
                    if (ethDate <= 0) {
                        if (ethDate > -5) {
                            ethDate = 5;
                        }
                        month = 13;
                        ethYear -= 1;
                    }
                }
                if (ethDate < 1) {
                    int y = ethDate * -1;
                    if (eoo.wongelawi().equals("Yohannes")) {
                        if (y <= 6) {//puagume=6
                            ethDate = y - 1;
                            month = 13;
                            ethYear -= 1;
                        } else {
                            ethDate = y - 3;//3 for puagume
                            ethDate = 31 - ethDate;//from ougest
                            month = 12;
                            ethYear -= 1;
                        }
                    } else {
                        if (y <= 5) {//puagume=5
                            ethDate = y - 1;
                            month = 13;
                            ethYear -= 1;
                            
                        } else {
                            ethDate = y - 4;
                            ethDate = 31 - ethDate;//from ougest
                            month = 12;
                            
                        }
                    }
                }
                break;
            case 2://tikimit
                if (eoo.wongelawi().equals("Yohannes")) {
                    ethDate = date - 11;
                } else {
                    ethDate = date - 10;
                }
                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 30 - ethDate;//from september
                    ethDate = y;
                    month -= 1;
                }
                break;
            case 3://hidar

                if (eoo.wongelawi().equals("Yohannes")) {
                    ethDate = date - 9;
                } else {
                    ethDate = date - 8;
                }

                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 31 - ethDate - 1;//
                    ethDate = y;
                    month -= 1;
                }
                break;
            case 4://tahsas

                if (eoo.wongelawi().equals("Yohannes")) {
                    ethDate = date - 10;
                } else {
                    ethDate = date - 9;
                }

                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 30 - ethDate;
                    ethDate = y;
                    month -= 1;
                }
                break;
            case 5://tir

                if (eoo.wongelawi().equals("Yohannes")) {
                    ethDate = date - 9;
                    if (ethDate < 1) {
                        ethDate *= -1;
                        int y = 31 - ethDate;
                        ethDate = y;
                        month -= 1;
                    }
                } else {
                    ethDate = date - 8;
                    if (ethDate < 1) {
                        ethDate *= -1;
                        int y = 31 - ethDate - 1;
                        ethDate = y;
                        month -= 1;
                    }
                }

                break;
            case 6://yekatit
                // february becomes 29 in leap year

                if (eoo.wongelawi().equals("Yohannes")) {
                    ethDate = date - 8;

                } else {
                    ethDate = date - 7;

                }
                if (ethDate < 1) {
                    ethDate = ethDate * -1;
                    int y = 31 - ethDate;
                    ethDate = y;
                    month = month - 1;
                }
                break;

            case 7://megabit   -------- finished     
                ethDate = date - 9;
                if (ethDate == 0) {

                }
                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 29 - ethDate;
                    ethDate = y;
                    month -= 1;
                }

                break;
            case 8://miazia

                ethDate = date - 8;

                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 31 - ethDate - 1;
                    ethDate = y;
                    month -= 1;
                }
                break;
            case 9://ginbot

                ethDate = date - 8;

                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 30 - ethDate;
                    ethDate = y;
                    month -= 1;
                }
                break;
            case 10://sene

                ethDate = date - 7;

                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 31 - ethDate - 1;
                    ethDate = y;
                    month -= 1;
                }
                break;
            case 11://hamle

                ethDate = date - 7;
                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 30 - ethDate;
                    ethDate = y;
                    month -= 1;
                }
                break;
            case 12://nehase

                ethDate = date - 6;
                if (ethDate < 1) {
                    ethDate *= -1;
                    int y = 31 - ethDate - 1;
                    ethDate = y;
                    month -= 1;
                }
                break;
        }

        setMonth(month);
        return ethDate + "/" + month + "/" + ethYear;
    }

    public void setMonth(int month) {
        ethMonth = month;

    }

    static public int getMonth() {

        return FromGregorianToEthopian.ethMonth;

    }

    public void setDate(int date) {
        ethDate = date;

    }

    static public int getDate() {

        return FromGregorianToEthopian.ethDate;

    }
}
