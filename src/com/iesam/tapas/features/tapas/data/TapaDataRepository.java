package com.iesam.tapas.features.tapas.data;

import com.iesam.tapas.features.tapas.domain.Tapa;
import com.iesam.tapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {


    //Patrón de diseño SingleTon para que no se creen muchas instancias
    private static TapaDataRepository instance = null;
    private ArrayList<Tapa> localTapas = new ArrayList<>(); //Tengo que saber para que es esto

    //Instancia de arraylist llamado localTapasa

    private TapaDataRepository() { //No se para que sirve este método
        initData();
    }

    private void initData() { //No se para que sirve este método: Es para añdir una tapa?? puede que si
        localTapas.add(new Tapa("#01", "Albóndiga de faisán", "Vermtería el Atrio", "0 ptos", "0.0", "Ninguno", "0", "Faisán y Gambón"));
        localTapas.add(new Tapa("#02", "Albóndiga de venado", "Bar/Restaurante Soul Kitchen", "0 ptos", "0.0", "Ninguno", "0", "Venado y Arándanos"));
        localTapas.add(new Tapa("#03", "Cerdería la bruja", "Restaurante La Bruja", "0 ptos", "0.0", "28 participantes", "28 votos", "Cerdo, cerveza"));
    }


    @Override //Método Obtener listado de tapas
    public ArrayList<Tapa> obtainTapas() {
        return localTapas;
    }

    @Override //Método Obtener una tapa en contreto
    public Tapa obtainTapa(String tapaId) {
         //Declaración varivale tapa
        for(int i = 0; i<localTapas.size(); i++) {
            Tapa tapa = localTapas.get(i);
            if(tapa.getId().equals(tapaId)){
                return tapa;
            } //El profesor lo ha hecho con un for-each, pero yo lo he hecho con un for
        }
        return null;
    }


    @Override //Método Borrar una tapa
    public void deleteTapa(String tapaId) {
        for(int i=0;i<localTapas.size();i++){
            if(localTapas.get(i).getId().equals(tapaId)){
                localTapas.remove(i);
            }
        }
    }

    @Override //Método Actualizar una tapa
    public void updateTapa(Tapa tapa) {
        deleteTapa(tapa.getId()); //Primero busca una tapa con ese id para borrarla
        saveTapa(tapa);     //Luego la sustituye con la tapa nueva (con modificaciones)
        //Para poder modificar o actualizar los datos de una tapa, luego debo guardala por lo que debo craer un caso de uso llamado guarda Tapa

    }

    @Override //Método Guardar una tapa
    public void saveTapa(Tapa tapa) {
        localTapas.add(tapa);

    }


    //Esto para el patrón de diseño SingleTon
    public static TapaDataRepository newInstance() {
        if (instance == null) {
            instance = new TapaDataRepository();
        }
        return instance;
    }


}
