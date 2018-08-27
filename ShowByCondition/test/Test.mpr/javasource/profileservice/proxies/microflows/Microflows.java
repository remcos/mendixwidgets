// This file was generated by Mendix Business Modeler 5.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package profileservice.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the ProfileService module

	public static String getDisplayName(IContext context, String _openID, String _environmentPassword, String _environmentUUID)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("OpenID", _openID);
			params.put("EnvironmentPassword", _environmentPassword);
			params.put("EnvironmentUUID", _environmentUUID);
			return (String)Core.execute(context, "ProfileService.GetDisplayName", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}