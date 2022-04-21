module waterworld {
    requires hanyaeger;

    exports com.github.hanyaeger.tutorial;

    opens audio;
    opens backgrounds;
    opens sprites;
    exports com.github.hanyaeger.tutorial.entities;
    exports com.github.hanyaeger.tutorial.entities.text;
    exports com.github.hanyaeger.tutorial.entities.SwordFish;

}
