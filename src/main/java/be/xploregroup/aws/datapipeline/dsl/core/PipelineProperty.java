package be.xploregroup.aws.datapipeline.dsl.core;

import com.amazonaws.services.datapipeline.model.Field;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 4/04/2016.
 */
public abstract class PipelineProperty {
    private String key;

    public abstract Field getField();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public abstract PipelineProperty withKey(String key);

    public static PipelineStringProperty build(String key, String value){
        return new PipelineStringProperty().withKey(key).withValue(value);
    }

    public static PipelineRefObjectProperty buildRef(String key, PipelineMapper value){
        return new PipelineRefObjectProperty().withKey(key).withValue(value);
    }

    public static PipelineRefStringProperty buildRef(String key, String value){
        return new PipelineRefStringProperty().withKey(key).withValue(value);
    }

}
