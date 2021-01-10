package com.mydata.platform.dto;

import com.mydata.platform.dto.scheduler.JobRequest;
import com.mydata.platform.model.JobType;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JobRequestTest {

    @Test
    public void isJobTypeSimple_getCurrentJobType_cronType인_경우() {
        JobRequest jobRequest = new JobRequest();
        jobRequest.setCronExpression("0/10 * * ? * *");
        assertThat(jobRequest.isJobTypeSimple()).isFalse();
        Assertions.assertThat(jobRequest.getCurrentJobType()).isEqualTo(JobType.CRON);
    }

    @Test
    public void isJobTypeSimple_getCurrentJobType_simpleType인_경우() {
        JobRequest jobRequest = new JobRequest();
        jobRequest.setRepeatCount(1);
        jobRequest.setRepeatIntervalInSeconds(1);
        assertThat(jobRequest.isJobTypeSimple()).isTrue();
        Assertions.assertThat(jobRequest.getCurrentJobType()).isEqualTo(JobType.SIMPLE);
    }
}