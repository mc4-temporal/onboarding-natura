/**
 * Banco Central De Bolivia
 * La Paz - Bolivia
 * bcb-mld-ejb
 * gob.bcb.mld.util.AppInicio
 * 06/04/2015 - 08:30:00
 * Creado por fbotello-MC4
 */
package bo.com.mc4.onboarding.core.util.exception;

public class OperationException extends RuntimeException
{

	private static final long serialVersionUID = 10316048604864L;


	public OperationException(String mensaje)
	{
		super(mensaje);
	}


	public OperationException(String mensaje, Throwable e)
	{
		super(mensaje, e);
	}

}
