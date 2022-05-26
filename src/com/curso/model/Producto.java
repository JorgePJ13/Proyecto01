package com.curso.model;

public class Producto {

    private String name;

    public Producto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Tienda de Productos");

        Producto p = new Producto("Lejia");
        System.out.println("Producto " + p.getName() + " en la tienda");
    }
}
