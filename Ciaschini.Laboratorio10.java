/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simone
 */
public class Lab10 {

    public static void main(String[] args) {

        /*
        //ContaNani1
        ContaNani1 thr1 = new ContaNani1();
        thr1.start();
        System.out.println(Thread.currentThread().getName());
         */
 /*        
        //ContaNani2
        Thread thr1 = new ContaNani2("Topolino");
        Thread thr2 = new ContaNani2("Pippo");
        thr1.start();
        thr2.start();
         */
 /*
        //ContaNaniTot
        //Mammolo, Brontolo, Eolo, Dotto, Gongolo, Cucciolo e Pisolo.
        Thread thr1 = new ContaNaniTot("Mammolo");
        Thread thr2 = new ContaNaniTot("Brontolo");
        Thread thr3 = new ContaNaniTot("Eolo");
        Thread thr4 = new ContaNaniTot("Dotto");
        Thread thr5 = new ContaNaniTot("Gongolo");
        Thread thr6 = new ContaNaniTot("Cucciolo");
        Thread thr7 = new ContaNaniTot("Pisolo");
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
         */
        //Campane
        Runnable cam1 = new Campana("din", 5);
        Thread thr1 = new Thread(cam1);
        thr1.start();
        Thread thr2 = new Thread(new Campana("don", 5));
        thr2.start();
        new Thread(new Campana("dan", 5)).start();
    }
}

