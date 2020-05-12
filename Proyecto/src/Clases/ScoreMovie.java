/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ScoreMovie implements Comparable<ScoreMovie>{
    
    double score = 0;
    ArrayList<Movie> peliculas = new ArrayList<>();
    
    public ScoreMovie(double score, Movie peli1){
        this.score = score;
        peliculas.add(peli1);
    }
    
    public double getSimilitud(){
        return score;
    }
    
    public void agregarPeli(Movie peli){
        Boolean agregar = true;
        for (Movie pelicula : peliculas) {
            if (peli.getTitle().equals(pelicula.getTitle())) {
                agregar = false;
                break;
            }
        }
        if (agregar) {
            peliculas.add(peli);   
        }
    }
    
    public ArrayList<Movie> devolverArraylist(){
        return peliculas;
    }
    
    @Override
    public int compareTo(ScoreMovie sp2){
        int estado = -1;
        if (this.score == sp2.getSimilitud()) {
            estado = 0;
        }
        else if (this.score > sp2.getSimilitud()) {
            estado = 1;
        }
        
        return estado;
    }
    
    public int getPeliculas(){
        return peliculas.size();
    }
}
