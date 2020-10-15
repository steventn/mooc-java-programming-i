/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Books {
   private String title = "";
   private int pages = 0;
   private int year = 0;
   
   public Books (String title, int pages, int year) {
       this.title = title;
       this.pages = pages;
       this.year = year;
   }
   
   public String getTitle () {
       return this.title;
   }
   
   @Override
   public String toString() {
       return this.title + ", " + this.pages + " pages, " + this.year;
   }
}
