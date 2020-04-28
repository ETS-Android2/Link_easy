package fr.willy.linky;


/**
 * Création d'un appareil électrique
 * ---------------------------------
 */
public class Devices {

    private int      id;
    private String   name;
    private int      power;
    private float    standbypower;
    private float    meanpower;
    private float    userate;


    /**
     *  Constructeur
     *  ------------
     */
    public Devices(int id, String name, int power,float standbypower, float meanpower, float userate) {
        super();
        this.id           = id;
        this.name         = name;
        this.power        = power;
        this.standbypower = standbypower;
        this.meanpower    = meanpower;
        this.userate      = userate;
    }

    public Devices() {

    }

    /**
     *  Création des Getter
     *  -------------------
     */
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
    public float getMeanPower(){return meanpower;}
    public float getStandbyPower() {
        return standbypower;
    }
    public float getUseRate() {
        return userate;
    }

    /**
     * Création des Setter
     * -------------------
     */
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setStandbyPower(float StandbyPower) {
        this.standbypower = StandbyPower;
    }
    public void setUseRate(float UseRate) {
        this.userate = UseRate;
    }
    public void setMeanPower(float MeanPower) {
        this.meanpower = MeanPower;
    }




}