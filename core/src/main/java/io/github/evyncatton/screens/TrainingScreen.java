package io.github.evyncatton.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.utils.ScreenUtils;

public class TrainingScreen extends ScreenAdapter {

    @Override
    public void show() {
        // Initialization code 
    }

    @Override
    public void render(float delta) {
        // Clear screen with a dark background color so you know it's running
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
    }
}