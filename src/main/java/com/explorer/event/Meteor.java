package com.explorer.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Meteor {
    private static final Integer MIN_LOCATION = 500;
    private static final Integer MAX_LOCATION = 1300;
    private static final Integer MIN_MASS = 100;
    private static final Integer MAX_MASS = 400;
    private static final Integer MIN_VELOCITY = 100;
    private static final Integer MAX_VELOCITY = 300;

    private Integer location;//: getRandomInt(500, 1300),
    private Integer mass; //: getRandomInt(100, 400),
    private Integer velocity;//: getRandomInt(100, 300)

    static Meteor generateNew() {
        return Meteor.builder()
                .location(Utils.randomInRange(MIN_LOCATION, MAX_LOCATION))
                .mass(Utils.randomInRange(MIN_MASS, MAX_MASS))
                .velocity(Utils.randomInRange(MIN_VELOCITY, MAX_VELOCITY))
                .build();
    }
}
