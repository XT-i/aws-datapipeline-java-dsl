package be.xploregroup.aws.datapipeline.dsl.core;

import com.amazonaws.services.datapipeline.model.Field;
import com.amazonaws.services.datapipeline.model.PipelineObject;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 4/04/2016.
 */
public class PipelineRefObjectProperty extends PipelineProperty {

    private PipelineObject value;

    @Override
    public Field getField() {
        return new Field().withKey(super.getKey()).withRefValue(value.getId());
    }

    public PipelineRefObjectProperty withKey(String key){
        super.setKey(key);
        return this;
    }

    public PipelineObject getValue() {
        return value;
    }

    public void setValue(PipelineObject value) {
        this.value = value;
    }

    public PipelineRefObjectProperty withValue(PipelineObject value){
        setValue(value);
        return this;
    }
}
