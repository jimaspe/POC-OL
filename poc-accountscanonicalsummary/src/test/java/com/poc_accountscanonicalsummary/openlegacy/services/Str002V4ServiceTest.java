package com.poc_accountscanonicalsummary.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"str002v4-test"})
public class Str002V4ServiceTest extends AbstractApiTest {

    public Str002V4ServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testStr002V4Service() throws Exception {
        String str002V4_input = "mock/Str002V4/test_str002V4-getStr002V4.input.json";
        String str002V4_output = "mock/Str002V4/test_str002V4-getStr002V4.output.json";
        super.baseTest(str002V4_input, str002V4_output, Str002V4ServiceImpl.class, "getStr002V4");
    }
}
