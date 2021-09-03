package io.github.libjsdl.api.event.events;

import com.sun.jna.Structure;

@Structure.FieldOrder({
        "type",
        "timestamp"
})
public final class SDL_OSEvent extends Structure {

    public int type;
    public int timestamp;
}