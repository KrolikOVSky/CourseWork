package com.course.backEnd;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Route {
    /*private Long id;
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

    public Route() {
        id = 0L;
        name = "";
        typeOfTransport = "";
        length = 0;
        countOfStops = 0;
    }

    /// Getters
    public Long getId() {
        return id;
    }

    /// Setters
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCountOfStops() {
        return countOfStops;
    }

    public void setCountOfStops(int countOfStops) {
        this.countOfStops = countOfStops;
    }

    @Override
    public String toString() {
        return String.format("\nID = %d\nName = %s\nType = %s\nLength = %s\nStops = %s\n", id, name, typeOfTransport, length, countOfStops);
    }*/
    private SimpleLongProperty id = new SimpleLongProperty();
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty typeOfTransport = new SimpleStringProperty();
    private SimpleIntegerProperty length = new SimpleIntegerProperty();
    private SimpleIntegerProperty countOfStops = new SimpleIntegerProperty();

    public Route() {
        /*id.set();
        name.set("new String()");
        typeOfTransport.set(new String());
        length.set(0);
        countOfStops.set(0);*/
    }

    public Route(SimpleLongProperty id, SimpleStringProperty name, SimpleStringProperty typeOfTransport, SimpleIntegerProperty length, SimpleIntegerProperty countOfStops) {
        this.id = id;
        this.name = name;
        this.typeOfTransport = typeOfTransport;
        this.length = length;
        this.countOfStops = countOfStops;
    }

    public long getId() {
        return id.get();
    }

    public SimpleLongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getTypeOfTransport() {
        return typeOfTransport.get();
    }

    public SimpleStringProperty typeOfTransportProperty() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport.set(typeOfTransport);
    }

    public int getLength() {
        return length.get();
    }

    public SimpleIntegerProperty lengthProperty() {
        return length;
    }

    public void setLength(int length) {
        this.length.set(length);
    }

    public int getCountOfStops() {
        return countOfStops.get();
    }

    public SimpleIntegerProperty countOfStopsProperty() {
        return countOfStops;
    }

    public void setCountOfStops(int countOfStops) {
        this.countOfStops.set(countOfStops);
    }

    @Override
    public String toString() {
        return String.format("\nID = %d\nName = %s\nType = %s\nLength = %s\nStops = %s\n", getId(), getName(), getTypeOfTransport(), getLength(), getCountOfStops());
    }
}
