package be.xploregroup.aws.datapipeline.dsl.other;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 5/04/2016.
 */
public enum TimeSpecifier {
    MINUTES("minutes"),
    HOURS("hours"),
    DAYS("days"),
    WEEKS("weeks"),
    MONTHS("months");

    private String timeSpecifier;

    TimeSpecifier(String timeSpecifier) {
        this.timeSpecifier = timeSpecifier;
    }

    public String getValue(){
        return timeSpecifier;
    }
}
