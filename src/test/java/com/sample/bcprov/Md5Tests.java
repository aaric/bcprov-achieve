package com.sample.bcprov;

import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.util.encoders.Hex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Md5Tests
 *
 * @author Aaric, created on 2022-04-02T10:12.
 * @version 0.2.0-SNAPSHOT
 */
@Slf4j
public class Md5Tests {

    @Test
    public void testEncrypt() {
        Digest digest = new MD5Digest();
        byte[] originBytes = "hello world".getBytes();
        digest.update(originBytes, 0, originBytes.length);
        byte[] md5Bytes = new byte[digest.getDigestSize()];
        digest.doFinal(md5Bytes, 0);
        log.info("origin: {}, md5: {}", new String(originBytes), Hex.toHexString(md5Bytes));

        Assertions.assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", Hex.toHexString(md5Bytes));
    }
}
