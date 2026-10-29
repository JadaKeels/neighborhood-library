package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NeighborhoodLibrary {
  public static void main(String[] args) {
    Scanner usesInput = new Scanner(System.in);

  //Inventory of 20 books
Book[20] listOfBooks = {
              new Book(1, "978-0-439-02352-8", "Hunger Games"),
              new Book(2, "978-0-439-02352-8", "Hunger Games Catching Fire"),
              new Book(3, "978-0-439-02352-8", "Hunger Games Mockingjay"),
              new Book(4, "978-0-439-02352-8", "Hunger Games Ballad of Songbirds and Snakes"),
              new Book(5, "978-0-439-02352-8", "Hunger Games Sunrise of the Reaping"),
              new Book(6, "978-0-439-02352-8", "Percy Jackson The Lightning Thief"),
              new Book(7, "978-0-439-02352-8", "Percy Jackson The Sea of Monsters"),
              new Book(8, "978-0-439-02352-8", "Percy Jackson The Titan’s Curse"),
              new Book(9, "978-0-439-02352-8", "Percy Jackson The Battle of the Labyrinth"),
              new Book(10, "978-0-439-02352-8", "Percy Jackson The Last Olympian"),
              new Book(11, "978-0-439-02352-8", "Percy Jackson The Chalice of the Gods"),
              new Book(12, "978-0-439-02352-8", "Percy Jackson The Wrath of the Triple Goddess"),
              new Book(13, "978-0-439-02352-8", "Magic Tree House Dinosours before Dark"),
              new Book(14, "978-0-439-02352-8", "Magic Tree House Pirates Past Dawn"),
              new Book(15, "978-0-439-02352-8", "Magic Tree House The Knight At Noon"),
              new Book(16, "978-0-439-02352-8", "Magic Tree House Mummies In The Morning"),
              new Book(17, "978-0-439-02352-8", "Magic Tree House Night Of The Ninjas"),
              new Book(18, "978-0-439-02352-8", "Magic Tree House Afternoon On The Amazon"),
              new Book(19, "978-0-439-02352-8", "Magic Tree House Sunset Of The Sabertooth"),
              new Book(20, "978-0-439-02352-8", "Magic Tree House Dolphins At Daybreak"),
      };

boolean running = true;

while (running) {
//Home Screen
      System.out.println("1 - Show Available Books");
      System.out.println("2 - Show Checked Out Books");
      System.out.println("3 - Exit out of the application");
      System.out.println("Chose option: ");
