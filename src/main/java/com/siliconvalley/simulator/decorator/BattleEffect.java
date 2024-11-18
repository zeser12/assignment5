
package com.siliconvalley.simulator.decorator;

import com.siliconvalley.simulator.builder.Startup;

public abstract class BattleEffect extends Startup {
    protected Startup decoratedStartup;

    public BattleEffect(Startup decoratedStartup) {
        super(decoratedStartup.getType(), decoratedStartup.getRevenue(), decoratedStartup.getMarketShare());
        this.decoratedStartup = decoratedStartup;
    }

    public abstract void attack(Startup target);
}
