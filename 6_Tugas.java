/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PakCandra;
import java.util.*;
/**
 * @author IDW4N_nCounter
 * Be a nice guy.
 */
public abstract class AlatMusik {
    public static void main(String[] args) {
        AlatMusik piano = new piano();
        AlatMusik biola = new biola();
        AlatMusik gitar = new gitar();
        AlatMusik drum = new drum();
        AlatMusik saxophone = new saxophone();
        AlatMusik trumpet = new trumpet();
        
        piano.namaAlatMusik();
        biola.namaAlatMusik();
        gitar.namaAlatMusik();
        drum.namaAlatMusik();
        saxophone.namaAlatMusik();
        trumpet.namaAlatMusik();
        
    }
    public abstract void namaAlatMusik();
    
}
class piano extends AlatMusik {
    @Override
    public void namaAlatMusik(){
        System.out.println("Piano");
    }
}
class biola extends AlatMusik {
    @Override
    public void namaAlatMusik(){
        System.out.println("Biola");
    }
}
class gitar extends AlatMusik {
    @Override
    public void namaAlatMusik(){
        System.out.println("Guitar");
    }
}
class drum extends AlatMusik {
    @Override
    public void namaAlatMusik(){
        System.out.println("Drum");
    }
}
class saxophone extends AlatMusik {
    @Override
    public void namaAlatMusik(){
        System.out.println("Saxophone");
    }
}
class trumpet extends AlatMusik {
    @Override
    public void namaAlatMusik(){
        System.out.println("Trumpet");
    }
}
