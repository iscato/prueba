/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author icarques
 */
public class User {
    private Long id;
    private String nombre;
    
    public User (String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }
    
    public String getNom() {
        return nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setNom(String nom) {
        this.nombre = nom;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
