package com.mydata.platform.dto.scheduler;

import com.mydata.platform.model.JobType;
import lombok.Data;
import org.quartz.JobDataMap;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class JobRequest {

    private String jobGroup = "DEFAULT";
    private String jobName;
    private String className;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startDateAt;
    private long repeatIntervalInSeconds;
    private int repeatCount;

    private String cronExpression;
    private JobDataMap jobDataMap;

    public boolean isJobTypeSimple() {
        return this.cronExpression == null;
    }

    public JobType getCurrentJobType() {
        return isJobTypeSimple() ? JobType.SIMPLE : JobType.CRON;
    }
}
