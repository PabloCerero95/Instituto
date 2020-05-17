FUTBO MANIAKOS
-----------------------------------------------------------






**FICHA TECNICA DE USO**

**Nombre**: Enviar mensajes de aportes

_______________________________________________________________

­**Autor:** Pablo José Cerero

_______________________________________________________________

**Fecha:** 16/05/2020

_______________________________________________________________

**Descripción:** Permite crear mensajes de aportes para la mejorar de la web

_______________________________________________________________

**Actores:** Usuario/Administrador

_______________________________________________________________

**Precondiciones:** Que el usuario este registrado en la página con un mínimo de 2 meses

Que el administrador tenga los poderes necesarios para revisar todos los mensajes de aportes de los usuarios

_____________________________________________________________________________

**Flujo Normal:** [1] El actor (Usuario) entrar en la sección de mensajería

[2] El actor clica en la sub-sección de mensajería de aportes

[3] El actor escribe la aportación que crea necesario para la mejorar de la web

[4] El actor clica al botón de enviar para que le llegue el mensaje al administrador

[5] El administrador recibe el mensaje del usuario

[6] El administrador responderá al usuario con la respuesta que crea adecuada para la mejorar de la web

[7] El usuario recibirá el mensaje del administrador, en su buzón habitual de mensajes

_____________________________________________________________________________

**Flujo Alternativo:** [3.A] El sistema de mensajería comprueba de que no se ha pasado el numero límites de caracteres, si es superado se le enviara una alerta al usuario de que ha superado el número de caracteres máximo.

[4.A] El usuario no ha podido enviar el mensaje porque la web ha entrado en mantenimiento y se le ha devuelto a la página principal

______________________________________________________________________________

**Poscondiciones:** El mensaje ha sido almacenado en la base de datos de mensajes y recibido  por el administrador de la web.
