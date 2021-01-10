Spring Boot Quartz Cluster
======
Spring Boot Quartz Cluster 관련 코드

## api
### Job 조회
### http://localhost:8080/scheduler/job

### Job 등록
### http://localhost:8080/scheduler/job
{
 "jobName" : "job1",
"cronExpression": "0/20 * * ? * *",
"startDateAt": "2011-11-11T11:11:11",
"repeatIntervalInSeconds": 15,
"repeatCount": 20,
"className": "com.advenoh.job.SimpleJob"
}
