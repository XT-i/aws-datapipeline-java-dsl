package be.xploregroup.aws.datapipeline.dsl.datanode;

import be.xploregroup.aws.datapipeline.dsl.common.FailureAndRerunMode;
import be.xploregroup.aws.datapipeline.dsl.common.ScheduleType;
import be.xploregroup.aws.datapipeline.dsl.core.PipelineMapper;
import be.xploregroup.aws.datapipeline.dsl.other.Period;
import com.amazonaws.services.datapipeline.model.PipelineObject;

import java.util.List;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 5/04/2016.
 */
public class CommonDataNode extends PipelineMapper {
    private String attempStatus;
    private Period attemptTimeout;
    private List<PipelineObject> dependsOn;
    private FailureAndRerunMode failureAndRerunMode;
    private Period lateAfterTimeout;
    private Integer maxActiveInstances;
    private Integer maximemRetries;
    private List<PipelineObject> onFail;
    private List<PipelineObject> onLateAction;
    private List<PipelineObject> onSuccess;
    private String pipelineLogUri;
    private List<PipelineObject> precondition;
    private Period reportProgressTimeout;
    private Period retryDelay;
    private PipelineObject runsOn;
    private ScheduleType scheduleType;
    private String workerGroup;
}
