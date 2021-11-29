пакет  ru.mirea.gibo0119.pr4 ;

import  java.lang. * ;

  public  class  Circle {
частный  int x;
частный  int y;
частный  int r;

public  Circle ( int  x , int  y , int  r ) {
        это . х = х;
        это . у = у;
        это . г = г;
        }

public  int  getX () {
        вернуть x;
        }

public  void  setX ( int  x ) {
        это . х = х;
        }

        public  int  getY () {
        вернуть y;
        }

public   void  setY ( int  y ) {
        это . у = у;
        }

public  int  getR () {
        return r;
        }

public   void  setR ( int  r ) {
        это . г = г;
        }

@Override
public  String  toString () {
        return  " Круг { "  +
        « х = »  + х +
        " , y = "  + y +
        " , r = "  + r +
        ' } ' ;
        }
public  double  getLength () {
        двойной l =  2  *  Мат . Пи  *  это . р;
        return l;
        }
public  double  getS () {
        двойной s =  Math . PI  *  Math . pow (r, 2 );
        return s;
        }
        }
