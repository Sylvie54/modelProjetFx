/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Sylvie
 */
public class ListePerson {
    // liste observable d'objets Person
    private static ObservableList<Person> personData = FXCollections.observableArrayList();
    public static ObservableList<Person> getPersonData() {
        return personData;
    }
    
    public static void ajouterPersonne(Person person) {
        personData.add(person);
    }
}
