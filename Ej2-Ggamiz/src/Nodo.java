public class Nodo {
private int info = 0;
private Nodo derecho = null;
private Nodo izquierdo = null;

public Nodo ( int x ) {
	this.info = x;
	this.derecho = null;
	this.izquierdo = null;
}

public Nodo getDerecho(){
	return this.derecho;
}

public void setDerecho(Nodo derecho){
	this.derecho = derecho;
}


public int getInfo(){
	return this.info;
}

public void setInfo(int info){
	this.info = info;
}


public Nodo getIzquierdo(){
	return this.izquierdo;
}

public void setIzquierdo(Nodo izquierdo){
	this.izquierdo = izquierdo;
}
}

