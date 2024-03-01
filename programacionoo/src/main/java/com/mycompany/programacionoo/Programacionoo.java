

package com.mycompany.programacionoo;

import characters.Character;
        
public class Programacionoo {

    public static void main(String[] args) {
     
     Character homero = new Character("Homero","Inspector de seguridad",33,"A la grande le puse cuca");
     homero.greeting();
        System.out.println(homero.getAge());
     
     Character bart = new Character();
     bart.setPhrase("Ayy caramba!!");
     bart.greeting();
     
    }
}
