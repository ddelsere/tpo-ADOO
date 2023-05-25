package org.uade.adoo.notificacion.adapter;

import org.uade.adoo.notificacion.NotificacionDTO;

public interface AdapterSMS {
    public void enviar(NotificacionDTO notificacionDTO);
}
