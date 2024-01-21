package com.iesam.tapas.features.tapas.domain;

public class UpdateTapaUseCase {
    private TapaRepository tapaRepository;

    //Constructor
    public UpdateTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //Metodo ejecutar
    public void execute(Tapa tapa){
        this.tapaRepository.updateTapa(tapa);
    }
}
