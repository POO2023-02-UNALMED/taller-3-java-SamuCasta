package taller3.televisores;

public class TV {
	
	public Marca marca;
	public int canal;
	public int precio ;
	public boolean estado;
	public int volumen;
	public Control control;
	public static int numTV=0;
	
	public TV(Marca marc,boolean estad) {
		marca = marc;
        estado = estad;
        canal = 1;
        volumen = 1;
        precio = 500;
        control = new Control();
        numTV++;
	}
	
	public Marca getMarca() {
        return marca;
    }
	
	public void setMarca(Marca marca1) {
        marca = marca1;
    }

	public void setEstado(boolean estad) {
        estado = estad;
    }

	public int getCanal() {
        return canal;
    }
	
	public void setCanal(int canal1) {
    	if(this.estado==true && canal1>=1 && canal1 <=120) {
    		canal = canal1;
    	}
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio1) {
        precio = precio1;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen1) {
    	if(this.estado==true && volumen1>=0 && volumen1 <=7) {
    		volumen = volumen1;
    	}
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control1) {
        control = control1;
    }
    
    public static int getNumTV(){
    	return numTV;
    }
    public static void setNumTV(int numTv){
    	TV.numTV = numTv;
    }
    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }
    
    public boolean getEstado() {
    	return estado;
    }
    
    public void canalDown() {
    	if (estado == true && canal >1 && canal <= 120) {
    		canal--;
    		}
    	}
        public void canalUp() {
        	if (estado == true && canal >= 1 && canal < 120) {
        		canal++;
        	}
        }
        public void volumenDown() {
        	if (estado == true && volumen > 0 && volumen <= 7) {
        		volumen--;
        	}
        }
        public void volumenUp() {
        	if (estado == true && volumen >= 0 && volumen < 7) {
        		volumen++;
        	}
        }
    
}
