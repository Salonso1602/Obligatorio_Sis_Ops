### Obligatorio_Sis_Ops

## Primera Entrega

En esta primera entrega, se deberá realizar lo siguiente:

	Instalación de una máquina virtual (tipo 2) con algún sistema operativo Linux server. Algunos de los sistemas operativos Linux server libres son: Ubuntu, Debian, CentosOS. 
	Crear un grupo llamado SO.
	Crear un usuario sin privilegios llamado SO_User.
	Crear un shell script llamado copiaSeguridad.sh que realizará una copia de seguridad del usuario cuyo nombre se pase como parámetro en un directorio de copias de seguridad que tendremos en nuestro sistema. El script deberá copiar el directorio personal del usuario elegido dentro del directorio /backup, en un directorio con el nombre del usuario. Por ejemplo, para el usuario javierpm, deberá copiar el directorio personal de javierpm en el directorio /backup/javierpm.
	Modificar la seguridad de Linux para que el usuario SO_User pueda ejecutar en modo root solo para el script copiaSeguridad.sh

A tener en cuenta:

Deberás tener en cuenta los siguientes requisitos:
	Respaldos
	Se debe ejecutar el script como root.
	Se debe pasar por parámetro el nombre de un usuario con cuenta en el sistema. Esto implicará comprobar:
	Que se ha pasado un valor en el parámetro 1
	Que el valor pasado por parámetro corresponde con el nombre de una cuenta de usuario en el sistema.
	Se deberá obtener la información de la cuenta de usuario del fichero de cuentas de usuario del sistema. En concreto necesitamos la ruta del directorio personal del usuario al que se va a realizar la copia de seguridad.
	Se deben mantener los permisos de los ficheros almacenados en el directorio personal del usuario en el directorio de copia de seguridad.
	Para el caso en que ya exista el directorio dentro de /backup, se deberá preguntar si se desea eliminar el backup existente. 
	Top
	Al inicio del sistema, se debe ejecutar un script cada 1 minuto que saque estadísticas del sistema y de cada proceso (automático). Consumo de CPU, memoria y demás información.
	La salida debe ser almacenada dentro del directorio /Estadisticas

Que entregar?

Se deberá entregar un informe de no más de 30 páginas detallando lo realizado, justificando pasos y decisiones, además del marco conceptual teórico correspondiente.

El informe deberá contener un breve capítulo de conclusiones.
