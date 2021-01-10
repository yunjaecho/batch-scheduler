package com.mydata.platform.dto.history;

import com.mydata.platform.model.JobType;
import com.mydata.platform.model.StateType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@Deprecated
public class JobHistoryStatusResponse {
    private Long statusId;
    private StateType jobState;
    private Date createDt;

    private String jobName;
    private String jobGroup;
    private JobType jobType;
}
