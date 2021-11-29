пакет  ru.mirea.gibo0119.pr4 ;

import  org.w3c.dom.ls.LSOutput ;
import  ru.mirea.gibo0119.pr4.Circle ;
import  java.util.Arrays ;
import  java.util.Scanner ;

  public  class  Main {
public  static  void  main ( String [] args ) {
        ru.mirea.gibo0119.pr4.Circle [] arr =  new ru.mirea.gibo0119.pr4. Круг [ 3 ];
        Scanner sc =  новый  сканер ( System . In);
        for ( int i =  0 ; i < arr . length; i ++ ) {
        int xx, yy, rr;
        хх = сбн . nextInt ();
        yy = sc . nextInt ();
        rr = sc . nextInt ();
        arr [i] =  новый  круг (xx, yy, rr);
        }
        Система . из . println ( " \ n Круг по умолчанию " );

        for ( int i =  0 ; i < arr . length; i ++ ) {
        Система . из . println (arr [я] . toString ());
        }
        Система . из . println ( " \ n Круг отсортирован по максимальному радиусу: " );
        Круг memp;
        for ( int i =  0 ; i < arr . length; i ++ ) {
        for ( int j =  0 ; j < arr . length -  1  - i; j ++ ) {
        if (arr [j] . getR () > arr [j +  1 ] . getR ()) {
        memp = arr [j];
        arr [j] = arr [j +  1 ];
        arr [j +  1 ] = memp;
        }
        }
        }

        for ( int i =  0 ; i < arr . length; i ++ ) {
        Система . из . println (arr [i]);
        }
        Система . из . println ( " \ n Круг отсортирован по минимальному радиусу: " );
        Температура круга ;
        for ( int i =  0 ; i < arr . length; i ++ ) {
        for ( int j =  0 ; j < arr . length -  1  - i; j ++ ) {
        if (arr [j] . getR () < arr [j +  1 ] . getR ()) {
        temp = arr [j];
        arr [j] = arr [j +  1 ];
        arr [j +  1 ] = темп;
        }
        }
        }

        for ( int i =  0 ; i < arr . length; i ++ ) {
        Система . из . println (arr [i]);
        }
        }

        }
