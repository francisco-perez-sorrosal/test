package com.perez.omid;

import static org.testng.Assert.fail;

public class SimpleClientTest {

//    @Test
    public void testGet() throws Exception {
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.get();
    }
}