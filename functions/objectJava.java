public class Persona {
	private String nombre, apellido;
	private LocalDate fec_nacimiento;

	public Persona(String no, String ap, LocalDate nac){
		nombre = no;
		apellido = ap;
		fec_nacimiento = nac;
	}


	public String getNombre(){
		return nombre;
	}

	public String getApeliido(){
		return apellido;
	}

}
