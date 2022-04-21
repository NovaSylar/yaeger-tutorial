package com.github.hanyaeger.tutorial;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.SwordFish.Swordfish;


public class Gamelevel extends DynamicScene {

    @Override
    public void setupEntities() {
    addEntity(new Swordfish(new Coordinate2D(200,200)));
    addEntity(new Hanny(new Coordinate2D(0,0)));

    }

    @Override
    public void setupScene() {

    }
}
