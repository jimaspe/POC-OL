package com.poc_accountscanonicalsummary.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"stj002svr-test"})
public class Stj002SvrServiceTest extends AbstractApiTest {

    public Stj002SvrServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testStj002SvrService() throws Exception {
        String stj002Svr_input = "mock/Stj002Svr/test_stj002Svr-getStj002Svr.input.json";
        String stj002Svr_output = "mock/Stj002Svr/test_stj002Svr-getStj002Svr.output.json";
        super.baseTest(stj002Svr_input, stj002Svr_output, Stj002SvrServiceImpl.class, "getStj002Svr");
    }
}
