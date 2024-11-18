
package com.siliconvalley.simulator.strategy;

import com.siliconvalley.simulator.builder.Startup;

public interface MarketEvent {
    void applyEffect(Startup startup);
}
