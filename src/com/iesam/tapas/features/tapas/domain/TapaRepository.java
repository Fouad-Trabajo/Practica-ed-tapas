package com.iesam.tapas.features.tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {

    ArrayList<Tapa> obtainTapas();  //GetTapasUseCase
    Tapa obtainTapa(String tapaId); //GetTapaUseCase
    void deleteTapa(String tapa); //DeleteTapaUseCases
    void updateTapa(Tapa tapa); //UpdateTapaUseCase
    void saveTapa(Tapa tapa); //SaveTapaUseCase



}
