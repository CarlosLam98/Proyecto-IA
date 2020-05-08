/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Carlos
 */
public class MyItemSimilarity implements ItemSimilarity{

    @Override
    public double itemSimilarity(Movie movie1, Movie movie2) {
        
        if (movie1.getTitle().equals(movie2.getTitle())) 
            return 0;
        
        double score = 0;
        if (movie1.getGenre().contains("|")) { //En caso de que genero 1 tenga varios generos
            String [] generos1 = movie1.getGenre().split("\\|");
            if (movie2.getGenre().contains("|")) { //En caso de que genero 2 tenga varios generos
                for (String generos11 : generos1) {
                    if (movie2.getGenre().toLowerCase().contains(generos11.toLowerCase())) {
                        score += 0.35;
                    }
                }
            }else{
                if (movie1.getGenre().toLowerCase().contains(movie2.getGenre().toLowerCase())) {
                    score += 0.35;
                }
            }
        }
        else{
            if (movie2.getGenre().toLowerCase().contains(movie1.getGenre().toLowerCase())) {
                score += 0.35;
            }
        }
        
        if (movie1.getDirector().toLowerCase().trim().equals(movie2.getDirector().toLowerCase().trim())) { //DIRECTOR
            score += 0.25;
        }
        
        if (movie1.getDuration() - 20 < movie2.getDuration() && movie1.getDuration() + 20 > movie2.getDuration()) {
            score += 0.25;
        }
        
        if (movie1.getPlotwords().contains("|")) { //Significa que tiene más de una
            String[] pelis = movie1.getPlotwords().split("\\|");
            if (movie2.getPlotwords().contains("|")) { //La segunda pelicula tambien tiene más de una
                for (int i = 0; i < pelis.length; i++) {
                    if (movie2.getPlotwords().toLowerCase().contains(pelis[i].toLowerCase())) {
                        score += 0.20;
                    }
                }
            }else{
                if (movie1.getPlotwords().toLowerCase().contains(movie2.getPlotwords().toLowerCase())) {
                     score += 0.20;
                }
            }
        }
        return score;
    }
}
