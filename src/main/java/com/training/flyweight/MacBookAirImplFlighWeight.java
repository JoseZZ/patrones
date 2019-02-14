package com.training.flyweight;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class MacBookAirImplFlighWeight implements MacBookAir {

    private String id;
    private MacLigero macLigero;

    // Solo tendremos distinto el id, el resto de campos los delegaremos
    public MacBookAirImplFlighWeight(String id, MacLigero macLigero) {
        this.id = id;
        this.macLigero = macLigero;
    }

    // No tenemos metodos set, ya que una vez comprado el equipo no podemos cambiar nada

    @Override
    public int getRam() {
        return macLigero.getRam();
    }

    @Override
    public int getDisco() {
        return macLigero.getDisco();
    }

    @Override
    public String getId() {
        return id;
    }
}
