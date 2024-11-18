
package com.siliconvalley.simulator;

import com.siliconvalley.simulator.builder.*;
import com.siliconvalley.simulator.decorator.*;
import com.siliconvalley.simulator.strategy.*;

public class Main {
    public static void main(String[] args) {
        // Demonstrate Builder Pattern
        System.out.println("=== Builder Pattern Demonstration ===");
        Startup fintechStartup = new Startup("FinTech", 100000, 15);
        TechGiant techGiant = new TechGiantBuilder()
                .setName("TechCorp")
                .addStartup(fintechStartup)
                .build();
        System.out.println("Tech Giant: " + techGiant.getName());
        System.out.println("Startups: " + techGiant.getStartups().get(0).getType());

        // Demonstrate Decorator Pattern
        System.out.println("=== Decorator Pattern Demonstration ===");
        Startup healthcareStartup = new Startup("Healthcare", 200000, 30);
        BattleEffect typeAdvantage = new TypeAdvantageDecorator(healthcareStartup);
        System.out.println("Base Startup Type: " + healthcareStartup.getType());
        typeAdvantage.attack(fintechStartup);

        // Demonstrate Strategy Pattern
        System.out.println("=== Strategy Pattern Demonstration ===");
        MarketEvent economicDownturn = new EconomicDownturn();
        System.out.println("Applying Economic Downturn on Healthcare Startup:");
        economicDownturn.applyEffect(healthcareStartup);
        System.out.println("Applying Economic Downturn on FinTech Startup:");
        economicDownturn.applyEffect(fintechStartup);
    }
}
