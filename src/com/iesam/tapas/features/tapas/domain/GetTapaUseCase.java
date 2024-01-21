package com.iesam.tapas.features.tapas.domain;

public class GetTapaUseCase {
    private TapaRepository tapaRepository;

    //Constructor
    public GetTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //Metodo ejecutar
    public Tapa execute(String tapaId) {
        return this.tapaRepository.obtainTapa(tapaId);
    } //Get tapa y Get tapas si devuelven un objeto, por eso este método es un poco distinto a los otros

}
