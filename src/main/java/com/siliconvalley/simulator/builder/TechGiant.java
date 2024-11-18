
package com.siliconvalley.simulator.builder;

import java.util.List;

public class TechGiant {
    private String name;
    private List<Startup> startups;

    public TechGiant(String name, List<Startup> startups) {
        this.name = name;
        this.startups = startups;
    }

    public String getName() {
        return name;
    }

    public List<Startup> getStartups() {
        return startups;
    }
}
