
package com.siliconvalley.simulator.decorator;

import com.siliconvalley.simulator.builder.Startup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {
    @Test
    public void testTypeAdvantageDecorator() {
        Startup baseStartup = new Startup("FinTech", 100000, 15);
        TypeAdvantageDecorator decoratedStartup = new TypeAdvantageDecorator(baseStartup);

        assertEquals("FinTech", decoratedStartup.getType(), "Startup type should match");
        // Add assertions or mock behavior as needed
    }
}
