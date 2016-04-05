package be.xploregroup.aws.datapipeline.dsl.core;

import com.amazonaws.internal.SdkInternalList;
import com.amazonaws.services.datapipeline.model.Field;
import com.amazonaws.services.datapipeline.model.PipelineObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 4/04/2016.
 */
public class PipelineMapper extends PipelineObject {
    private String id;
    private String name;
    private String parent;
    private Map<String, PipelineProperty> fieldMap;

    @Override
    public List<Field> getFields() {
        if(fieldMap == null){
            return new SdkInternalList<>();
        }
        List<Field> fields = new ArrayList<>();
        for (PipelineProperty pipelineProperty : fieldMap.values()) {
            Field field = pipelineProperty.getField();
            if(field != null){
                fields.add(field);
            }
        }
        return fields;
    }

    public void addField(Field field) {
        if(field.getKey() != null){
            if(field.getStringValue() != null){
                addPipelineProperty(PipelineProperty.build(field.getKey(), field.getStringValue()));
            } else if(field.getRefValue() != null){
                addPipelineProperty(PipelineProperty.build(field.getKey(), field.getRefValue()));
            }
        }
    }

    public void addPipelineProperty(PipelineProperty property) {
        if(fieldMap == null){
            fieldMap = new HashMap<>();
        }

        if(property != null){
            fieldMap.put(property.getKey(), property);
        }
    }

    public void withPipelineProperty(PipelineProperty property) {
        if(fieldMap == null){
            fieldMap = new HashMap<>();
        }

        if(property != null){
            fieldMap.put(property.getKey(), property);
        }
    }

}
