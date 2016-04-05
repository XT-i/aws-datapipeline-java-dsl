package be.xploregroup.aws.datapipeline.dsl.common;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 6/04/2016.
 */
public enum ScheduleType {
    CRON("cron"),
    ONDEMAND("ondemand"),
    TIMESERIES("timeseries");

    private String value;

    ScheduleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
