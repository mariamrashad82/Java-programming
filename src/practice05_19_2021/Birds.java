package practice05_19_2021;

public class Birds {
    // Birds bird = new Birds();
    // bird.setSpecies()

    private String species;
    private boolean canFly;
    private double beakLength;
    private String planet = "Earth";

    public String getPlanet(){
        return this.planet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if(species == null || species.isEmpty()){
            return;
        }
        this.species = species;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
//        if(beakLength < 0) {
//            return;
//        }
//        this.beakLength = beakLength;

        if(beakLength > 0) {
            this.beakLength = beakLength;
        } else {
            System.out.println("Invalid length");
        }

    }
}

