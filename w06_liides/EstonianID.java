import java.time.LocalDate;

public class EstonianID implements PersonalCodeBehaviour {
    public String code = "39912214711";

    public EstonianID(String code){

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
        int month = Integer.parseInt(code.substring(3, 5));
        int day = Integer.parseInt(code.substring(5, 7));

        return day + "-" + month + "-" + getFullYear();
    }

    @Override
    public int getAge() {
        return 0;
    }
}
