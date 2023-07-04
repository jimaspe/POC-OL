package com.poc_accountscanonicalsummary.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"str002v3-test"})
public class Str002V3ServiceTest extends AbstractApiTest {

    public Str002V3ServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testStr002V3Service() throws Exception {
        String str002V3_input = "mock/Str002V3/test_str002V3-getStr002V3.input.json";
        String str002V3_output = "mock/Str002V3/test_str002V3-getStr002V3.output.json";
        super.baseTest(str002V3_input, str002V3_output, Str002V3ServiceImpl.class, "getStr002V3");
    }
}
