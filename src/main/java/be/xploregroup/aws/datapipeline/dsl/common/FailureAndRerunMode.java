package be.xploregroup.aws.datapipeline.dsl.common;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 5/04/2016.
 */
public enum FailureAndRerunMode {
    NONE("none"),
    CASCADE("cascade");

    private String value;

    FailureAndRerunMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
