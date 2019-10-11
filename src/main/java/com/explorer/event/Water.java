package com.explorer.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Water {

    private static final Integer MIN_DISTANCE = 100;
    private static final Integer MAX_DISTANCE = 1300;
    private static final Integer MIN_DEPTH = 50;
    private static final Integer MAX_DEPTH = 200;

    private Integer distance; //: getRandomInt(100, 1300),
    private Integer depth; //: getRandomInt(50, 200)

    static Water generate() {
        return Water.builder()
                .distance(Utils.randomInRange(MIN_DISTANCE, MAX_DISTANCE))
                .depth(Utils.randomInRange(MIN_DEPTH, MAX_DEPTH))
                .build();
    }
}
