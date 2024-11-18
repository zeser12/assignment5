
package com.siliconvalley.simulator.builder;

public class Startup {
    private String type;
    private int revenue;
    private int marketShare;

    public Startup(String type, int revenue, int marketShare) {
        this.type = type;
        this.revenue = revenue;
        this.marketShare = marketShare;
    }

    public String getType() {
        return type;
    }

    public int getRevenue() {
        return revenue;
    }

    public int getMarketShare() {
        return marketShare;
    }

    public void attack(Startup target) {
        if (target != null) {
            System.out.println(this.type + " is attacking " + target.getType() + "!");
        }
    }
}
