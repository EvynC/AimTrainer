package io.github.evyncatton.app;

import com.badlogic.gdx.Game;

import io.github.evyncatton.screens.*;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class AimTrainerGameMain extends Game {
    // Main entry point extending Game

    @Override
    public void create() {
        // later initialize our ScreenManager or AssetManager 
        
        // set active screen
        setScreen(new TrainingScreen());
    }

    @Override
    public void dispose() {
        super.dispose();

        // Screen disposal is automatically handled by the Game class when screens change
        // Global assets/managers can be cleaned up here.
    }
}
