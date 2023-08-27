package taller3.televisores;

public class Control {
	public TV tv;
	
	public Control() {
		
	}
	public void enlazar(TV tv1) {
		this.tv= tv1;
		tv1.setControl(this);
	}
	
	public void turnOn() {
        if (tv != null) {
            tv.turnOn();
        }
    }

    public void turnOff() {
        if (tv != null) {
            tv.turnOff();
        }
    }

    public void canalUp() {
        if (tv != null) {
            tv.canalUp();
        }
    }

    public void canalDown() {
        if (tv != null) {
            tv.canalDown();
        }
    }

    public void volumenUp() {
        if (tv != null) {
            tv.volumenUp();
        }
    }

    public void volumenDown() {
        if (tv != null) {
            tv.volumenDown();
        }
    }

    public void setCanal(int nuevoCanal) {
        if (tv != null) {
            tv.setCanal(nuevoCanal);
        }
    }

    public void setVolumen(int nuevoVolumen) {
        if (tv != null) {
            tv.setVolumen(nuevoVolumen);
        }
    }
	
	public TV getTelevisor() {
		return tv;
	}
	public void setTelevisor(TV tv1) {
		this.tv = tv1;
	}

}
