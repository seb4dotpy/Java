public class UpdatingVariables {

    public static void main(String[] args) {
        int salary = 1000;
        int bono = 200;
        int descuento = 50;
        //El trabajador tiene un bono de $200 y un descuento de $50
        salary += bono;
        salary -= descuento;
        System.out.println(salary);

        //Actualizando Strings
        String persona = "Sebastian";
        //A Sebastian le falta el apellido
        persona = persona + " " + "Ohberg";
        System.out.println(persona);
    }
}
