/**
 * @author Diana Zaray Corado & Abraham Corado
 * @version 16/01/20
 */
import java.text.DecimalFormat;

public class cRadio implements iRadio{

	private double femisora = 87.9;
	private int aemisora = 530;
	private int frecuencia = 0;//Inicia en AM
	private boolean est = true;//Inicia apagado
	private String emi = "";
	private double[] fmEmisoras = new double[12];
	private int[] amEmisoras = new int[12];
	
	

	/**
	 * onOff
	 * Enciende o apaga la radio
	 */
	public void onOff() {
		// TODO Auto-generated method stub
		if(est == false)
			est = true;
		else if(est == true)
			est = false;
		}
	

	/**
	 * estado
	 * Devuelde el estado en el cual se encuentra la radio en ese momento
	 */
	public boolean estado() {
		// TODO Auto-generated method stub
		return est;
	}


	/**
	 * cambiarFrecuencia
	 * Verifica la frecuencia en al cual se encuentra el radio en el momento y en base a eso 
	 * la cambia a AM o FM
	 */
	public void cambiarFrecuencia() {
		// TODO Auto-generated method stub
		if(frecuencia == 0)
			frecuencia = 1;
		else if(frecuencia == 1)
			frecuencia = 0;
	}

	/**
	 * avanzar
	 * Aumenta de emisora dependiendo de la frecuencia en la cual se encuentre el radio
	 */
	public void avanzar() {
		// TODO Auto-generated method stub
		
		if(frecuencia == 0) {
			if(aemisora < 1610) {
				aemisora += 10;
				if(aemisora == 1610)
					aemisora = 530;
				}
			}
			
		 if(frecuencia == 1) {
				if(femisora < 107.9) {
					femisora += 0.2;
					if(femisora == 107.9)
						femisora = 87.9;
					}
		     	}
		}
	
	/**
	 * estacionActual
	 * Verifica que estacion esta sonando actualemente en la radio
	 * @return emi
	 */
	public String estacionActual() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.0");
		
		if(frecuencia == 0)
			emi = String.valueOf(aemisora);
		else if(frecuencia == 1)
			emi =  df.format(femisora);
		return emi;
	}

	/**
	 * guardar
	 * en la lista de emisoras (que dependen de la frecuencia) guarda la emisora
	 * seleccionada por el usuario dependiendo el boton que presione el usuario
	 */
	public void guardar(int boton) {
		// TODO Auto-generated method stub
		if(frecuencia == 0) {
			if(amEmisoras[boton-1] == 0)
				amEmisoras[boton-1] = aemisora;
			else
				aemisora = amEmisoras[boton-1];
		}
		else if(frecuencia == 1) {
			fmEmisoras[boton-1] = femisora;
			if(fmEmisoras[boton-1] == 0)
				fmEmisoras[boton-1] = femisora;
			else
				femisora = fmEmisoras[boton-1];
			}
	}

	/**
	 * seleccionarEmisora
	 * Obtiene la emisora guardada en la posicion que indique el usuario
	 * segun el boton que presione
	 */
	public void seleccionarEmisora(int boton) {
		// TODO Auto-generated method stub
		if(frecuencia == 0) {
			aemisora = (int) amEmisoras[boton-1];
		}
		else if(frecuencia == 1)
			femisora = fmEmisoras[boton-1];
	}

	
}
