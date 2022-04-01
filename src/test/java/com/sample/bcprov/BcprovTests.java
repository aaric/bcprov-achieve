package com.sample.bcprov;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * BcprovTests
 *
 * @author Aaric, created on 2022-04-01T16:04.
 * @version 0.1.0-SNAPSHOT
 */
@Slf4j
public class BcprovTests {

    @Test
    public void testHello() {
        String hello = new String(new byte[]{'h', 'e', 'l', 'l', 'o'});
        log.info("{}", hello);
        Assertions.assertEquals("hello", hello);
    }
}
