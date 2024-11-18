
package com.siliconvalley.simulator.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BuilderTest {
    @Test
    public void testTechGiantBuilder() {
        Startup startup = new Startup("FinTech", 100000, 15);
        TechGiant techGiant = new TechGiantBuilder()
                .setName("TechCorp")
                .addStartup(startup)
                .build();

        assertNotNull(techGiant, "TechGiant object should not be null");
        assertEquals("TechCorp", techGiant.getName(), "TechGiant name should match");
        assertEquals(1, techGiant.getStartups().size(), "TechGiant should have one startup");
        assertEquals("FinTech", techGiant.getStartups().get(0).getType(), "Startup type should match");
    }
}
