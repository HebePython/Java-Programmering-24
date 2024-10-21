package Java_playground.java_test.Lab2;

public class World {
    String zoneName;


    class ZoneTavern extends World {
        public ZoneTavern() {
            zoneName = "Tavern";
        }

        public void takeRest(Player player) {
            player.addHealth(10);
        }

        public void openShop(Player player) {
            // call shop class ?
        }

    }
    
    class ZoneForest extends World {
        public ZoneForest() {
            zoneName = "Forest";
        }

    }

    class ZoneDesert extends World {
        public ZoneDesert() {
            zoneName = "Desert";
        }

    }

    class Swamp extends World {
        public Swamp() {
            zoneName = "Swamp";
        }

    }

    class Tavernbasement extends World { 
        public Tavernbasement() {
            zoneName = "Tavern basement";
        }

    }
}
