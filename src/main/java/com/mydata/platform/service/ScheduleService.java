package com.mydata.platform.service;

import com.mydata.platform.dto.scheduler.JobRequest;
import com.mydata.platform.dto.scheduler.StatusResponse;
import org.quartz.Job;
import org.quartz.JobKey;

public interface ScheduleService {
    StatusResponse getAllJobs();

    boolean isJobRunning(JobKey jobKey);

    boolean isJobExists(JobKey jobKey);

    boolean addJob(JobRequest jobRequest, Class<? extends Job> jobClass);

    boolean deleteJob(JobKey jobKey);

    boolean pauseJob(JobKey jobKey);

    boolean resumeJob(JobKey jobKey);

    String getJobState(JobKey jobKey);

    boolean stopJob(JobKey jobKey);

    boolean updateJob(JobRequest jobRequest);
}
