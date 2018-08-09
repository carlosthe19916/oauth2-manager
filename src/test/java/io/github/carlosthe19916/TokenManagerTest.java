package io.github.carlosthe19916;

import org.junit.Assert;
import org.junit.Test;

public class TokenManagerTest {

    @Test
    public void test() {
        TokenManager tokenManager = new TokenManager("a", "b");
        Assert.assertEquals("a", tokenManager.getRefreshToken().get());
    }

}
