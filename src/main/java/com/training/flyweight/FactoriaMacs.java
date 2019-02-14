package com.training.flyweight;

// La factoria nos ayudara a crear los mac apoyandose en los macs ligeros
public class FactoriaMacs {

    public static MacBookAir crearMacBookAir(String id, int ram, int disco) {
        MacLigero macLigero = ContenedorMacLigero.getMacLigero(ram, disco);
        MacBookAir macBookAir = new MacBookAirImplFlighWeight(id, macLigero);
        return macBookAir;
    }
}
