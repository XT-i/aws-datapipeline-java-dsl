package be.xploregroup.aws.datapipeline.dsl.core;

import com.amazonaws.services.datapipeline.model.Field;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 4/04/2016.
 */
public class PipelineStringProperty extends PipelineProperty {

    private String value;

    @Override
    public Field getField() {
        return new Field().withKey(super.getKey()).withStringValue(value);
    }

    @Override
    public PipelineStringProperty withKey(String key) {
        super.setKey(key);
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PipelineStringProperty withValue(String value) {
        setValue(value);
        return this;
    }
}
