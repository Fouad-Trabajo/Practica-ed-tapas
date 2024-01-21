package com.iesam.tapas.features.tapas.data;

import com.iesam.tapas.features.tapas.domain.Tapa;
import com.iesam.tapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {


    @Override //Esto debo cambiarlo
    public ArrayList<Tapa> obtainTapas() {
        ArrayList<Tapa> tapas = new ArrayList<>();
        tapas.add(new Tapa("#01", "Albóndiga de faisán", "Vermtería el Atrio","0 ptos","0.0","Ninguno","0","Faisán y Gambón"));
        tapas.add(new Tapa("#02","Albóndiga de venado","Bar/Restaurante Soul Kitchen","0 ptos","0.0","Ninguno","0","Venado y Arándanos"));
        return tapas;
    }

    @Override
    public Tapa obtainTapa(String tapaId) {
        return null;
    }


    @Override
    public void deleteTapa(String tapa) {

    }

    @Override
    public void updateTapa(Tapa tapa) {

    }


}
