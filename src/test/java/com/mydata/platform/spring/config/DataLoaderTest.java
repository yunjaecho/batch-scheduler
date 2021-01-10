package com.mydata.platform.spring.config;

import com.mydata.platform.model.JobType;
import com.mydata.platform.spring.DataLoader;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.anyOf;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class DataLoaderTest {
    private DataLoader dataLoader;

    @Before
    public void setUp() throws Exception {
        dataLoader = new DataLoader();
    }

    @Test
    public void getRandomSetElement() {
        Condition<JobType> simple = new Condition<>(jobType -> jobType == JobType.SIMPLE, "simple");
        Condition<JobType> cron = new Condition<>(jobType -> jobType == JobType.CRON, "cron");

        Assertions.assertThat(dataLoader.getRandomJob()).is(anyOf(simple, cron));
    }
}