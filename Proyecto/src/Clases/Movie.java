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
public class Movie implements MovieInterface{

    
    private String Title;
    private String Genre;
    private String Director;
    private String Actor1;
    private String Actor2;
    private String Actor3;
    private double IMDBscore;
    private double Duration;
    private String PlotKeyword;
    
    
    @Override
    public void createMovie(String[] movie) {
        this.Title = movie[0];
        if (!movie[1].isEmpty()) {
            this.IMDBscore = Double.parseDouble(movie[1]);
        }else{
            this.IMDBscore = 0;
        }
        
        if (!movie[2].isEmpty()) {
            this.Duration = Double.parseDouble(movie[2]);
        }else{
            this.Duration = 0;
        }
        this.Genre = movie[3];
        this.Director = movie[4];
        this.Actor1 = movie[5];
        this.Actor2 = movie[6];
        this.Actor3 = movie[7];
        this.PlotKeyword = movie[8];
    }
    
    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public double getIMDBScore() {
        return this.IMDBscore;
    }

    @Override
    public double getDuration() {
        return this.Duration;
    }

    @Override
    public String getGenre() {
        return this.Genre;
    }

    @Override
    public String getDirector() {
        return this.Director;
    }

    @Override
    public String getActor1() {
        return this.Actor1;
    }

    @Override
    public String getActor2() {
        return this.Actor2;
    }

    @Override
    public String getActor3() {
        return this.Actor3;
    }

    @Override
    public String getPlotwords() {
        return this.PlotKeyword;
    }

    @Override
    public String[] getMovie() {
        String[] datos = new String[8];
        datos[0] = this.Title;
        datos[1] = String.valueOf(this.IMDBscore);
        datos[2] = String.valueOf(this.Duration);
        datos[3] = this.Genre;
        datos[4] = this.Director;
        datos[5] = this.Actor1;
        datos[6] = this.Actor2;
        datos[7] = this.Actor3;
        return datos;
    }

    
    
    
}
