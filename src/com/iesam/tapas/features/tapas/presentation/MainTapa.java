package com.iesam.tapas.features.tapas.presentation;

import com.iesam.tapas.Main;
import com.iesam.tapas.features.tapas.data.TapaDataRepository;
import com.iesam.tapas.features.tapas.domain.*; //Al poner * importamos todos las Casos de Uso de la carpeta dominio


import java.util.ArrayList;
import java.util.Scanner;

public class MainTapa { //No hay main, son métodos que se ponen directamente sobre la clase


    //MÉTODOS ESPECIALES

    //Crear una tapa
    public static void createTapa(Tapa tapa) {
        TapaDataRepository tapaDataRepository = TapaDataRepository.newInstance();
        SaveTapaUseCase saveTapaUseCase = new SaveTapaUseCase(tapaDataRepository);
        saveTapaUseCase.execute(tapa);
    }

    //Imprimir lista de tapas - Array
    public static void printTapas() {
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        //imprimir cada una de las tapas
        System.out.println(tapas.toString());
    }

    //Imprimir 1 tapa en concreto
    public static void printTapa(String petId) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(petId);
        System.out.println(tapa.toString());
    }

    //Borrar una tapa
    public static void deleteTapa(String tapaId) {
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(tapaId);
    }

    //Modificar-Actualizar una tapa
    public static void updateTapa(Tapa tapa) {
        UpdateTapaUseCase updateTapaUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updateTapaUseCase.execute(tapa);
        System.out.println(""); //Salto de línea
    }

}

