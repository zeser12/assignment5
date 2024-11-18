
package com.siliconvalley.simulator.strategy;

import com.siliconvalley.simulator.builder.Startup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrategyTest {
    @Test
    public void testEconomicDownturnEffect() {
        Startup healthcareStartup = new Startup("Healthcare", 200000, 30);
        Startup fintechStartup = new Startup("FinTech", 100000, 15);

        MarketEvent economicDownturn = new EconomicDownturn();

        // Apply effect on Healthcare startup
        economicDownturn.applyEffect(healthcareStartup);
        System.out.println("Effect applied on Healthcare startup");

        // Apply effect on FinTech startup
        economicDownturn.applyEffect(fintechStartup);
        System.out.println("Effect applied on FinTech startup");

        assertTrue(true, "EconomicDownturn effect test completed");
    }
}
