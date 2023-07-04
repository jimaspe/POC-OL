package com.poc_accountscanonicalsummary.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"str002v2-test"})
public class Str002V2ServiceTest extends AbstractApiTest {

    public Str002V2ServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testStr002V2Service() throws Exception {
        String str002V2_input = "mock/Str002V2/test_str002V2-getStr002V2.input.json";
        String str002V2_output = "mock/Str002V2/test_str002V2-getStr002V2.output.json";
        super.baseTest(str002V2_input, str002V2_output, Str002V2ServiceImpl.class, "getStr002V2");
    }
}
