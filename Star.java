class Star {

    private String name;
    private double radius;
    private double mass;
    private int effectiveTemp;

    public Star(String name, double radius, double mass, int effectiveTemp){
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    public String toString(){
        return "the "+name + " that have the radius of " +radius+ "km "+"and the mass of "+mass+" kg";
    }
}