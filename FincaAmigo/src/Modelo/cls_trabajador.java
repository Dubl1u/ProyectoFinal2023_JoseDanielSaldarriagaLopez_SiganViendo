
package Modelo;


public class cls_trabajador {
    private String str_code;
    private String str_nombre;
    private String str_sexo;
    private String str_title;
    private String str_contaco;
    private String str_direccion;
    private String str_correo;

    public cls_trabajador(String str_code, String str_nombre, String str_sexo, String str_title, String str_contaco, String str_direccion, String str_correo) {
        this.str_code = str_code;
        this.str_nombre = str_nombre;
        this.str_sexo = str_sexo;
        this.str_title = str_title;
        this.str_contaco = str_contaco;
        this.str_direccion = str_direccion;
        this.str_correo = str_correo;
    }

    public String getStr_code() {
        return str_code;
    }

    public void setStr_code(String str_code) {
        this.str_code = str_code;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_sexo() {
        return str_sexo;
    }

    public void setStr_sexo(String str_sexo) {
        this.str_sexo = str_sexo;
    }

    public String getStr_title() {
        return str_title;
    }

    public void setStr_title(String str_title) {
        this.str_title = str_title;
    }

    public String getStr_contaco() {
        return str_contaco;
    }

    public void setStr_contaco(String str_contaco) {
        this.str_contaco = str_contaco;
    }

    public String getStr_direccion() {
        return str_direccion;
    }

    public void setStr_direccion(String str_direccion) {
        this.str_direccion = str_direccion;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }


}
