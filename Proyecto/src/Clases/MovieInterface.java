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
public interface MovieInterface {
    public void createMovie(String[] movie, int codigo);
    public String getTitle();
    public double getIMDBScore();
    public double getDuration();
    public String getGenre();
    public String getDirector();
    public String getActor1();
    public String getActor2();
    public String getActor3();
    public String getPlotwords();
    public String[] getMovie();
}
