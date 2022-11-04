class Empleado extends Persona{
    private LocalDate ingreso;

    public Empleado(String no, String ap){
        super(no, ape);
        this.ingreso = LocalDate.now();
    }


    public int getAntiguedad(){
         if ((ingreso != null) && (LocalDate.now() != null)) {
            return Period.between(ingreso, LocalDate.now()).getYears();
        } 
        return 0;
    }




}