package interfases2;


public class TestOrdenar {
    public static void main(String[] args) {
        /*
        Persona p1 = new Persona(20,"ana");
        Persona p2 = new Persona(80, "beto");
        Persona p3 = new Persona(30, "carla");
        Persona p4 = new Persona(40, "daniela");
        Persona p5 = new Persona(70, "ernesto");
        Persona p6 = new Persona(60, "felipe");
        Persona p7 = new Persona(5, "zulema");
       
       
        Persona[] personas = {p1,p2,p3,p4,p5,p6,p7};
        
        //definimos, ordenamos y mostramos
        Util.ordenar(personas);
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());
        }

        //definimos, ordenamos y mostramos
        String[] arr2 = {"ana","beto","carla","daniela","ernesto","felipe","zulema"};
        Util.ordenar(arr2);
        muestraArray(arr2);

        //definimos, ordenamos y mostramos
        Integer[] arr3 = {20,80,30,40,70,60,5};
        Util.ordenar(arr3);
        muestraArray(arr3);
        */

        //definimos, ordenamos y mostramos
        Persona arr[]={new Persona(20,"ana"),
                       new Persona(80, "beto"),
                       new Persona(30, "carla"),
                       new Persona(40, "daniela"),new 
                       Persona(70, "ernesto"),new 
                       Persona(60, "felipe"),new 
                       Persona(5, "zulema")
                    };
        //por el criterio de id
        System.out.println("Por id");
        Util.ordenar(arr,new CriterioPersonaId());
        Util.imprimir(arr);


        //por el criterio de nombre
        System.out.println("Por nombre");
        Util.ordenar(arr,new CriterioPersonaNombre());
        Util.imprimir(arr);

        
         
        

       
        
    }
    private static void muestraArray(Comparable<?> arr[]){
        for (int i=0; i<arr.length; i++){ 
            System.out.println(arr[i]);
        }
    }

}
