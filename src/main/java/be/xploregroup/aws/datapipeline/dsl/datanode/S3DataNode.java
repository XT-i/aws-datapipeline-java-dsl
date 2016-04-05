package be.xploregroup.aws.datapipeline.dsl.datanode;

import be.xploregroup.aws.datapipeline.dsl.core.PipelineMapper;
import com.amazonaws.services.datapipeline.model.PipelineObject;

import java.util.List;

/**
 * Project: aws-datapipeline-java-dsl
 * Created by Michael Willemse on 5/04/2016.
 */
public class S3DataNode extends CommonDataNode {
    private Compression compression;
    private PipelineObject dataFormat;
    private String directoryPath;
    private String filePath;
    private S3EncryptionType s3EncryptionType;

    public enum Compression {
        NONE("none"), GZIP("gzip");

        private String value;

        Compression(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum S3EncryptionType {
        NONE("NONE"), SERVER_SIDE_ENCRYPTION("SERVER_SIDE_ENCRYPTION");

        private String value;

        S3EncryptionType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
