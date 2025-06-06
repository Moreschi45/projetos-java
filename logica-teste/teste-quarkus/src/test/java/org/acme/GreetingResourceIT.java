package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
public class GreetingResourceIT {

    @Test
    public void testSoma() {
        assertEquals(2, 1 + 1);
    }
}