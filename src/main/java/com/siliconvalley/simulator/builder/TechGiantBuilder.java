
package com.siliconvalley.simulator.builder;

import java.util.ArrayList;
import java.util.List;

public class TechGiantBuilder {
    private String name;
    private List<Startup> startups = new ArrayList<>();

    public TechGiantBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public TechGiantBuilder addStartup(Startup startup) {
        this.startups.add(startup);
        return this;
    }

    public TechGiant build() {
        return new TechGiant(name, startups);
    }
}
