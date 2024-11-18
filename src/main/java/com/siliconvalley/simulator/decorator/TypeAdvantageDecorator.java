
package com.siliconvalley.simulator.decorator;

import com.siliconvalley.simulator.builder.Startup;

public class TypeAdvantageDecorator extends BattleEffect {
    public TypeAdvantageDecorator(Startup decoratedStartup) {
        super(decoratedStartup);
    }

    @Override
    public void attack(Startup target) {
        System.out.println(this.getType() + " attacks " + target.getType() + " with type advantage!");
        decoratedStartup.attack(target);
    }
}
