package lifestylecoach.rest.models;

public class Measure {

    public Integer uid;
    public String measureType;
    public String measureValue;
    public String date;

    public Measure(Integer uid, String measureType, String measureValue, String date) {
        this.uid = uid;
        this.measureType = measureType;
        this.measureValue = measureValue;
        this.date = date;
    }
}
