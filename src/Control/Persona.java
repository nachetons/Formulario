package Control;


public class Persona {
    
    //variables
    public static String Nombre;
    public static String Apellidos;
    public String Edad;
    public static String Email;
    public String Telefono;
    public static String Pass;

    
    //Constructor por parametros
    public Persona(String Nombre, String Apellidos, String Edad, String Email, String Telefono, String Pass) {
        Persona.Nombre = Nombre;
        Persona.Apellidos = Apellidos;
        this.Edad = Edad;
        Persona.Email = Email;
        this.Telefono = Telefono;
        Persona.Pass = Pass;
    }

    public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	//constructor por defecto
    public Persona() {
    }
    
    
    
}
