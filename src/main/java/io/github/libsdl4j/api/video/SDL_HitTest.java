package io.github.libsdl4j.api.video;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.intellij.lang.annotations.MagicConstant;
import io.github.libsdl4j.api.rect.SDL_Point;

/**
 * <p><b>Warning:</b> It is necessary to keep a reference to the callback object somewhere in your Java program,
 * otherwise JNA would dispose of the object (GC would clean it) and the callback function would no longer
 * be available for SDL library's C code to call.<br/>
 * In case you did not keep the reference you would encounter an error like this:<br/>
 * <code>JNA: callback object has been garbage collected</code></p>
 */
@FunctionalInterface
public interface SDL_HitTest extends Callback {

    /**
     * Callback used for hit-testing.
     *
     * @param win the SDL_Window where hit-testing was set on
     * @param area an SDL_Point which should be hit-tested
     * @param data what was passed as {@code callbackData} to SDL_SetWindowHitTest()
     * @return an SDL_HitTestResult value.
     *
     * @see SdlVideo#SDL_SetWindowHitTest(SDL_Window, SDL_HitTest, Pointer)
     */
    @MagicConstant(valuesFromClass = SDL_HitTestResult.class)
    int testHit(
            SDL_Window win,
            SDL_Point area,
            Pointer data);
}