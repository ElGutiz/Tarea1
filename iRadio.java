
public interface iRadio {
	
public void onOff();//Verifica si la radio se encuentra encendida o apagada
public boolean estado();//Cambia el estado de la radio on/off
public void cambiarFrecuencia();//Cambia de AM a FM o viceversa
public void avanzar();//cambia la emisora que se esta escuchando
public String estacionActual();//obtiene la emisora que esta sonando en ese momento
public void guardar(int a);//guarda la emisora indicada en un boton especifico
public void seleccionarEmisora(int a);//selecciona la emisora que se ha guardado en un boton
}
