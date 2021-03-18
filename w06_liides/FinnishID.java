import java.time.LocalDate;
import java.time.Period;

public class FinnishID implements PersonalCodeBehaviour {
    public String code;
    
    public FinnishID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {
        int genderNum = Integer.parseInt(code.substring(7, 9));

        if (genderNum % 2 == 0){
            return "female";
        } else {
            return "male";
        }
    }

    @Override
    public int getFullYear() {
        int year = Integer.parseInt(code.substring(4, 6));

        if (year > 21) {
            return year + 1900;
        } else if (year <= 21){
            return year + 2000;
        } else {
            return 0;
        }
    }

    @Override
    public int getMonth() {
        int month = Integer.parseInt(code.substring(2, 4));
        return month;
    }

    @Override
    public int getDay() {
        int day = Integer.parseInt(code.substring(0, 2));
        return day;
    }

    @Override
    public String getDOB() {
        return getDay() + "-" + getMonth() + "-" + getFullYear();
    }

    @Override
    public int getAge() {
        LocalDate dateOfBirth = LocalDate.of(getFullYear(), getMonth(), getDay());
        LocalDate now = LocalDate.now();
        String num = Integer.toString(Period.between(dateOfBirth, now).getYears());
        int age = Integer.parseInt(num);
        return age;
    }

}
