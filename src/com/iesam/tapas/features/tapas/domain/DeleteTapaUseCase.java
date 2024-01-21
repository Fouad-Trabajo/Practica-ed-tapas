package com.iesam.tapas.features.tapas.domain;

public class DeleteTapaUseCase {

    //Atributo?
    private TapaRepository tapaRepository;

    //Constructor
    public DeleteTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //Metodo ejecutar
    public void execute(String tapaId){
        tapaRepository.deleteTapa(tapaId);
    }
}
