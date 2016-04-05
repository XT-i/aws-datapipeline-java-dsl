package be.xploregroup.aws.datapipeline.dsl.other;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 5/04/2016.
 */
public class Period {
    private TimeSpecifier timeSpecifier;
    private Integer number;

    public Period(TimeSpecifier timeSpecifier, Integer number) {
        this.timeSpecifier = timeSpecifier;
        this.number = number;
    }

    public TimeSpecifier getTimeSpecifier() {
        return timeSpecifier;
    }

    public Integer getNumber() {
        return number;
    }

    public String getValue(){
        return number + " " + timeSpecifier.getValue();
    }

    public static Period minutes(Integer number){
        return new Period(TimeSpecifier.MINUTES, number);
    }

    public static Period hours(Integer number){
        return new Period(TimeSpecifier.HOURS, number);
    }

    public static Period days(Integer number){
        return new Period(TimeSpecifier.DAYS, number);
    }

    public static Period weeks(Integer number){
        return new Period(TimeSpecifier.WEEKS, number);
    }

    public static Period months(Integer number){
        return new Period(TimeSpecifier.MONTHS, number);
    }
}
