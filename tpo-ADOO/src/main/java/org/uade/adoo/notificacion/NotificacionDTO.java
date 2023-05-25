package org.uade.adoo.notificacion;

public class NotificacionDTO {

    private String texto;
    private String telefonoDestinatario;
    private String telefonoRemitente;
    private String emailDestinatario;
    private String emailRemitente;
    private String mensaje;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTelefonoDestinatario() {
        return telefonoDestinatario;
    }

    public void setTelefonoDestinatario(String telefonoDestinatario) {
        this.telefonoDestinatario = telefonoDestinatario;
    }

    public String getTelefonoRemitente() {
        return telefonoRemitente;
    }

    public void setTelefonoRemitente(String telefonoRemitente) {
        this.telefonoRemitente = telefonoRemitente;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmailRemitente() {
        return emailRemitente;
    }

    public void setEmailRemitente(String emailRemitente) {
        this.emailRemitente = emailRemitente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
