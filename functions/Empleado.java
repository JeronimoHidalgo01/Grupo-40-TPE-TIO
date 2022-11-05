class Empleado extends Persona{
    private LocalDate ingreso;	
    private String area;
    private int codOS;

    public Empleado(String no, String ap, String ar, int cod){
        super(no, ape);
        this.ingreso = LocalDate.now();
	this.area = ar;
	this.codOS = cod;
    }


    public int getAntiguedad(){
         if ((ingreso != null) && (LocalDate.now() != null)) {
            return Period.between(ingreso, LocalDate.now()).getYears();
        } 
        return 0;
    }

    public String getArea(){
    	return area;
    }

    public int getCodOS(){
    	return codOS;
    }




}
