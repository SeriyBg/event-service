package com.explorer.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GroundEvent {

    private Integer distance;

    static GroundEvent generate() {
        return GroundEvent.builder()
                .distance(Utils.randomInRange(100, 500))
                .build();
    }
}
