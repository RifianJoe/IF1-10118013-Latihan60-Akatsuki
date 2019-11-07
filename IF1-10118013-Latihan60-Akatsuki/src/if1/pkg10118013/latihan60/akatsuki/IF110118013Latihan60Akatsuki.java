/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan60.akatsuki;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("AKATSUKI");
         
        System.out.println("\nPetinggi Akatsuki");
        PetinggiAkatsuki pAkatsuki = new PetinggiAkatsuki();
        pAkatsuki.TampilNama();
        pAkatsuki.asalDesa();
        pAkatsuki.kekuatan();
        pAkatsuki.jutsuSpecial();
        pAkatsuki.penampilan();
        System.out.println();
        
        System.out.println("Team Kakuzu");
        TeamKakuzu tKakuzu = new TeamKakuzu();
        System.out.println();
        
        System.out.println("Team Itachi");
        TeamItachi tItachi = new TeamItachi();
        System.out.println();
        
        System.out.println("Team Sasori");
        TeamSasori tSasori = new TeamSasori();
        System.out.println();
        
        System.out.println("Team Pain");
        TeamPain tPain = new TeamPain();
    }
    
}
