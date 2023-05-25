package org.uade.adoo.notificacion;

public abstract class Notificador {
    private EstrategiaNotificador estrategia;

    public abstract void enviarNotificacion(NotificacionDTO notificadorDTO) ;
    public void modificarTipoNotificacion(EstrategiaNotificador tipo){}
}
