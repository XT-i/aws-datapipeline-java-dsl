package be.xploregroup.aws.datapipeline.dsl.core;

import com.amazonaws.services.datapipeline.model.Field;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 4/04/2016.
 */
public class PipelineRefStringProperty extends PipelineProperty{

    private String value;

    @Override
    public Field getField() {
        return new Field().withKey(super.getKey()).withRefValue(value);
    }

    public PipelineRefStringProperty withKey(String key){
        super.setKey(key);
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PipelineRefStringProperty withValue(String value){
        setValue(value);
        return this;
    }
}
