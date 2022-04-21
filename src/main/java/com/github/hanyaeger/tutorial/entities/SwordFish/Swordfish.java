package com.github.hanyaeger.tutorial.entities.SwordFish;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class Swordfish extends DynamicSpriteEntity implements SceneBorderCrossingWatcher, Collider, Collided {
    public Swordfish(Coordinate2D location){
        super("sprites/swordfish.png", location);
        setMotion(2, 270d);
    }
    @Override
    public void notifyBoundaryCrossing(SceneBorder border){
        setAnchorLocationX(getSceneWidth());
    }

    @Override
    public void onCollision(Collider collider) {

    }
}

