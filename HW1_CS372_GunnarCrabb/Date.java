
public class Date{

    private int day;
    private int month;
    private int year;

    public Date (int Day, int Month, int Year) {
        assert(Month >= 1 && Month <= 12);

        if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12) {
            assert(Day >= 1 && Day <= 31);
        }
        else if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
            assert(Day >=1 && Day <= 30);
        }
        else {
            if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
                assert(Day >=1 && Day <= 29);
            }
            else {
                assert(Day >=1 && Day <= 28);
            }
        }

        day = Day;
        month = Month;
        year = Year;
        //Year has no assertions because there can be negative years (B.C and A.D)
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int newDay) {

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            assert(newDay >= 1 && newDay <= 31);
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            assert(newDay >=1 && newDay <= 30);
        }
        else {
            if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
                assert(newDay >=1 && newDay <= 29);
            }
            else {
                assert(newDay >=1 && newDay <= 28);
            }
        }

        day = newDay;
    }

    public void setMonth(int newMonth) {
        if (day == 31) {
            assert(newMonth == 1 || newMonth == 3 || newMonth == 5 || newMonth == 7 || newMonth == 8 || newMonth == 10 || newMonth == 12);
        }
        else if (day == 30) {
            assert(newMonth == 1 || newMonth >=3 && newMonth <= 12);
        }
        else if (day == 29) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                assert(newMonth >=1 && newMonth <= 12);
            }
            else {
                assert(newMonth == 1 || newMonth <=3 && newMonth >= 12);
            }
        }


        month = newMonth;
    }

    public void setYear(int newYear) {
        if (day == 29 && month == 2) {
            assert(newYear % 4 == 0 && newYear % 100 != 0 || newYear % 400 == 0);
        }
        year = newYear;
    }

    public Date compare (Date D1, Date D2) {
        int dayDif;
        int monDif;
        int yearDif;

        dayDif = D1.getDay() - D2.getDay();
        monDif = D1.getMonth() - D2.getMonth();
        yearDif = D1.getYear() - D2.getYear();

        if (monDif > 12) {
            monDif -= 12;
            yearDif++;
        }
        else if (monDif < 1) {
            monDif += 12;
            yearDif--;
        }
        else {
        }

        if (monDif == 1 || monDif == 3 || monDif == 5 || monDif == 7 || monDif == 8 || monDif == 10 || monDif == 12) {
            if (dayDif > 31) {
                dayDif -= 31;
                monDif++;
            }
            else if (dayDif < 1) {
                dayDif += 31;
                monDif--;
            }
            else {
            }
        }
        else if (monDif == 4 || monDif == 6 || monDif == 9 || monDif == 11) {
            if (dayDif > 30) {
                dayDif -= 30;
                monDif++;
            }
            else if (dayDif < 1) {
                dayDif += 30;
                monDif--;
            }
            else {
            }
        }
        else {
            if (yearDif % 4 == 0 && yearDif % 100 != 0 || yearDif % 400 == 0) {
                if (dayDif > 29) {
                    dayDif -= 29;
                    monDif++;
                }
                else if (dayDif < 1) {
                    dayDif += 29;
                    monDif--;
                }
                else {
                }
            }
            else {
                if (dayDif > 28) {
                    dayDif -= 28;
                    monDif++;
                }
                else if (dayDif < 1) {
                    dayDif += 28;
                    monDif--;
                }
                else {
                }
            }
        }

        return D3 = new Date(dayDif, monDif, yearDif);

    }

    public static void showCurrentDate() {
        System.out.println(java.time.LocalDate.now());
    }


}