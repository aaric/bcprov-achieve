# bcprov-achieve

[![License](https://img.shields.io/badge/License-MIT-green.svg?style=flat&logo=github)](https://www.mit-license.org)
[![JDK](https://img.shields.io/badge/JDK-1.8-success.svg?style=flat&logo=java)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![JUnit](https://img.shields.io/badge/JUnit-5.8.2-success.svg?style=flat&logo=junit5)](https://junit.org/junit5/docs/current/user-guide)
[![Gradle](https://img.shields.io/badge/Gradle-7.2-success.svg?style=flat&logo=gradle)](https://docs.gradle.org/7.2/userguide/installation.html)
[![Release](https://img.shields.io/badge/Release-0.2.0-informational.svg)](https://github.com/aaric/bcprov-achieve/releases)

> [Encryption &amp; Decryption Learning.](https://github.com/bcgit/bc-java/wiki)

## 1 MD5

```java
public class BcprovUtil {
    public static String md5(String origin) {
        Digest digest = new MD5Digest();
        byte[] originBytes = origin.getBytes();
        digest.update(originBytes, 0, originBytes.length);
        byte[] md5Bytes = new byte[digest.getDigestSize()];
        digest.doFinal(md5Bytes, 0);
        return Hex.toHexString(md5Bytes);
    }
}
```
