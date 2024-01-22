package com.iesam.tapas.features.tapas.domain;

public class SaveTapaUseCase {
    //Implementar la interfaz
    private TapaRepository tapaRepository;


    //Constructor
    public SaveTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //Método ejecutar
    public void execute(Tapa tapa){
        tapaRepository.saveTapa(tapa);
    }
}
