
package Modelo;


public class cls_parcela {
     private String str_codigoF;
     private String str_nombreF;
     private String str_extencion;
     private String str_contactoF;
     private String str_direccionP;
     private String str_cultivos;
     private String str_codigoT;

    public cls_parcela(String str_codigoF, String str_nombreF, String str_extencion, String str_contactoF, String str_direccionP, String str_cultivos, String str_codigoT) {
        this.str_codigoF = str_codigoF;
        this.str_nombreF = str_nombreF;
        this.str_extencion = str_extencion;
        this.str_contactoF = str_contactoF;
        this.str_direccionP = str_direccionP;
        this.str_cultivos = str_cultivos;
        this.str_codigoT = str_codigoT;
    }

    public String getStr_codigoF() {
        return str_codigoF;
    }

    public void setStr_codigoF(String str_codigoF) {
        this.str_codigoF = str_codigoF;
    }

    public String getStr_nombreF() {
        return str_nombreF;
    }

    public void setStr_nombreF(String str_nombreF) {
        this.str_nombreF = str_nombreF;
    }

    public String getStr_extencion() {
        return str_extencion;
    }

    public void setStr_extencion(String str_extencion) {
        this.str_extencion = str_extencion;
    }

    public String getStr_contactoF() {
        return str_contactoF;
    }

    public void setStr_contactoF(String str_contactoF) {
        this.str_contactoF = str_contactoF;
    }

    public String getStr_direccionP() {
        return str_direccionP;
    }

    public void setStr_direccionP(String str_direccionP) {
        this.str_direccionP = str_direccionP;
    }

    public String getStr_cultivos() {
        return str_cultivos;
    }

    public void setStr_cultivos(String str_cultivos) {
        this.str_cultivos = str_cultivos;
    }

    public String getStr_codigoT() {
        return str_codigoT;
    }

    public void setStr_codigoT(String str_codigoT) {
        this.str_codigoT = str_codigoT;
    }

  
}
