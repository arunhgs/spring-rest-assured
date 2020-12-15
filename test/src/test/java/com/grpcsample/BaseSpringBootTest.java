package com.grpcsample;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest(classes = ClientApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BaseSpringBootTest extends AbstractTestNGSpringContextTests {
}
