/*
USO DE CLASES PREDEFINIDAS EN JAVA: enum
Uso de enum (calse predefinida)
metodos basicos: values(),valueOf() ordinal()
el contenido de enum son objetos y estos pueden obtener un estado a traves de 
los atributos en metodos
 */
package unidad_2;

/**
 *
 * @author alext
 */
enum Licenciaturas{
    ADMON,CONTABILIDAD,RECHUM;
}
enum Ingenierias{
    SISTEMAS,INFORMATICA,INDUSTRIAL;
}
public class UsoDeenum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se utiliza o se accede primero a variables de enum Licenciaturas
        Licenciaturas lic1 = Licenciaturas.ADMON;
        System.out.println("Licenciaturas");
        //se toma el valor de objeto actual
        System.out.println(lic1);
        
        Licenciaturas lic2 = Licenciaturas.CONTABILIDAD;
        System.out.println(lic2);
        
        Licenciaturas lic3 = Licenciaturas.RECHUM;
        System.out.println(lic3);
        
        // se utiliza enum Ingenierias
        Ingenierias ing;  //declaraacion de variable (objrto)
        ing = Ingenierias.SISTEMAS;  //instanciacion de ing
        System.out.println("Ingenierias");
        System.out.println("Tipo de ingenieria: "+ing);
        System.out.println();
        
        ing=Ingenierias.INFORMATICA;
        
        //se compara llos dos objetos (valores)
        if(ing==Ingenierias.INFORMATICA)
            System.out.println("Carrera: ing. Informatica");
        
        // uso de uno de los valores declarados en enum Ingerierias
        switch(ing){
            case SISTEMAS:
                System.out.println("Especialidad Ciberseguridad");
                break;
            case INDUSTRIAL:
                System.out.println("Especialidad Diseño");
                break;
            case INFORMATICA:
                System.out.println("Especalidad Software");
                break;
        }
        // enum en un bucke
        Licenciaturas arr[] = Licenciaturas.values();
        for(Licenciaturas lics:arr){
            // utilizar el metodo ordinal() para que se visualice el indice
            
            System.out.println(lics+" en el indice"+lics.ordinal());
    }
        // al usar el metodo valueOf (devuelve un objeto)
        System.out.println(Licenciaturas.valueOf("ADMON"));
    }
}
