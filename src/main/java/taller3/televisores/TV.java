package taller3.televisores;

public class TV {
  private Marca marca;
  private int canal=1;
  private int precio=500;
  private boolean estado;
  private int volumen=1;
  private Control control;
  public static int numTV;

  public TV(Marca marca1, boolean estado1){this.marca = marca1;this.estado = estado1;numTV++;}
  public Marca getMarca(){return marca;}
  public void setMarca(Marca marca1){this.marca = marca1;}
  public int getCanal() {return canal;}
  public void setCanal(int canal1) {if(estado==true){if(canal1<=120&&canal1>=1){this.canal = canal1;}}}
  public int getPrecio() {return precio;}
  public void setPrecio(int precio1) {this.precio=precio1;}
  public int getVolumen() {return volumen;}
  public void setVolumen(int volumen1) {if(estado==true){if(volumen1<=7&&volumen1>=0){this.volumen=volumen1;}}}
  public Control getControl() {return control;}
  public void setControl(Control control1) {this.control=control1;}

  public static int getNumTV(){return numTV;}
  public static void setNumTV(int num1){numTV=num1;}

  public void turnOn(){this.estado=true;}
  public void turnOff(){this.estado=false;}
  public boolean getEstado(){return estado;}

  public void canalUp(){if(estado==true){if (canal<120) {canal++;}}}
  public void canalDown(){if(estado==true){if (canal>1) {canal--;}}}
  public void volumenUp(){if(estado==true){if (volumen<7) {volumen++;}}}
  public void volumenDown(){if(estado==true){if (volumen>0) {volumen--;}}}
}