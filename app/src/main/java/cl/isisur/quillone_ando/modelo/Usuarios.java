package cl.isisur.quillone_ando.modelo;

public class Usuarios {
    private String Id_usuario;
    private String Nombre_usuario;
    private String Apellido_usuario;

    public Usuarios() {
        Id_usuario = "";
        Nombre_usuario = "";
        Apellido_usuario = "";
    }

    public Usuarios(String id_usuario, String nombre_usuario, String apellido_usuario) {
        Id_usuario = id_usuario;
        Nombre_usuario = nombre_usuario;
        Apellido_usuario = apellido_usuario;
    }

    public String getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        Id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        Nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return Apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        Apellido_usuario = apellido_usuario;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "Id_usuario='" + Id_usuario + '\'' +
                ", Nombre_usuario='" + Nombre_usuario + '\'' +
                ", Apellido_usuario='" + Apellido_usuario + '\'' +
                '}';
    }

}
