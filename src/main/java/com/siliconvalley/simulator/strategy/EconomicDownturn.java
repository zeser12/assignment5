
package com.siliconvalley.simulator.strategy;

import com.siliconvalley.simulator.builder.Startup;

public class EconomicDownturn implements MarketEvent {
    @Override
    public void applyEffect(Startup startup) {
        if (startup.getType().equals("Healthcare")) {
            System.out.println("Boosting revenue for " + startup.getType() + " startup by 20%");
        } else if (startup.getType().equals("FinTech")) {
            System.out.println("Reducing revenue for " + startup.getType() + " startup by 20%");
        }
    }
}
