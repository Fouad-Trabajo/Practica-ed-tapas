package com.iesam.tapas.features.tapas.domain;

public class Tapa {
    //Atributo de la clase (Tapa)
    private String id;
    private String nombre;
    private String nombreEstablecimiento;
    private String totalPuntos;
    private String mediaVotos;
    private String numeroParticipantes;
    private String totalVotos;
    private String ingredientes;

    //Construcctor de la clase(Tapa)
    public Tapa(String id, String nombre, String nombreEstablecimiento, String totalPuntos, String mediaVotos, String numeroParticipantes, String totalVotos, String ingredientes) {
        this.id = id;
        this.nombre = nombre;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.totalPuntos = totalPuntos;
        this.mediaVotos = mediaVotos;
        this.numeroParticipantes = numeroParticipantes;
        this.totalVotos = totalVotos;
        this.ingredientes = ingredientes;
    }

    //Getter y Setter de la clase
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public String getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(String totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public String getMediaVotos() {
        return mediaVotos;
    }

    public void setMediaVotos(String mediaVotos) {
        this.mediaVotos = mediaVotos;
    }

    public String getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(String numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public String getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(String totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    //ToString
    @Override
    public String toString() {
        return "\n Tapa " +
                "\n ID = " + id  +
                "\n NOMBRE = " + nombre +
                "\n NOMBRE ESTABLECIMIENTO = " + nombreEstablecimiento +
                "\n TOTAL PUNTOS = " + totalPuntos +
                "\n MEDIA VOTOS = " + mediaVotos +
                "\n NÚMERO PARTICIPANTES = " + numeroParticipantes +
                "\n TOTAL VOTOS = " + totalVotos +
                "\n INGREDIENTES = " + ingredientes + "\n";

    }
}
