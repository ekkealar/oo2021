import java.time.LocalDate;
import java.time.Period;

public class EstonianID implements PersonalCodeBehaviour {
    public String code;
    
    public EstonianID(String code){
        this.code = code;
    }

    @Override
    public String getGender(){
        int genderNum = Character.getNumericValue(code.charAt(0));
        /*if(genderNum % 2 == 0){
            return "naine";
        } else {
            return "mees";
        }*/

        return genderNum % 2 == 0 ? "female" : "male";
    }

    @Override
    public int getFullYear(){
        int year = Integer.parseInt(code.substring(1, 3));

        if (year > 21) {
            return year + 1900;
        } else if (year <= 21){
            return year + 2000;
        } else {
            return 0;
        }

    }
    @Override
    public String getDOB(){
        return getDay() + "-" + getMonth() + "-" + getFullYear();
    }

    @Override
    public int getMonth() {
        int month = Integer.parseInt(code.substring(3, 5));
        return month;
    }

    @Override
    public int getDay() {
        int day = Integer.parseInt(code.substring(5, 7));
        return day;
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
