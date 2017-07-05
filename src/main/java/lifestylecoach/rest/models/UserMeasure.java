package lifestylecoach.rest.models;

/**
 * Created by matteo on 18/06/17.
 */
public class UserMeasure extends User {

    public String height;
    public String weight;

    public UserMeasure(Integer uid, String name, String surname,
                       String sex, String birthdate, String waist,
                       String hip, String height, String lastWeight) {
        super(uid, name, surname, sex, birthdate, waist, hip);

        this.height = height;
        this.weight = lastWeight;
    }


}
