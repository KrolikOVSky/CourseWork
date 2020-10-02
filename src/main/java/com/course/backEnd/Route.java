package com.course.backEnd;

public class Route {
    private Long id;
    private String name;
    private String typeOfTransport;
    private int length;
    private int countOfStops;

    public Route(Long id, String name, String typeOfTransport, int length, int countOfStops) {
        this.id = id;
        this.name = name;
        this.typeOfTransport = typeOfTransport;
        this.length = length;
        this.countOfStops = countOfStops;
    }

    public Route(Long id) {
        this.id = id;
        name = "";
        typeOfTransport = "";
        length = 0;
        countOfStops = 0;
    }

    public Route(){
        id = 0L;
        name = "";
        typeOfTransport = "";
        length = 0;
        countOfStops = 0;
    }

    /// Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCountOfStops(int countOfStops) {
        this.countOfStops = countOfStops;
    }

    /// Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public int getLength() {
        return length;
    }

    public int getCountOfStops() {
        return countOfStops;
    }

    @Override
    public String toString(){
        return String.format("");
    }
}
