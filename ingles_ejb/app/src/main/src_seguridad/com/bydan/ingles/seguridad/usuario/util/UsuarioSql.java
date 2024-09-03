/*
* ============================================================================
* GNU Lesser General Public License
* ============================================================================
*
* BYDAN - Free Java BYDAN library.
* Copyright (C) 2008 
* 
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
* 
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
* 
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
* 
* BYDAN Corporation
*/
package com.bydan.ingles.seguridad.usuario.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Set;

/*
import org.json.JSONArray;
import org.json.JSONObject;
*/

//import java.util.ArrayList;
import com.bydan.framework.ingles.business.logic.Pagination;
import com.bydan.framework.ingles.business.logic.QueryWhereSelectParameters;
import com.bydan.framework.ingles.util.Connexion;
import com.bydan.framework.ingles.util.ConnexionType;
import com.bydan.framework.ingles.util.Constantes;
import com.bydan.framework.ingles.util.Funciones;
import com.bydan.framework.ingles.util.ParameterDbType;
import com.bydan.ingles.seguridad.usuario.business.entity.*;
//import com.bydan.ingles.seguridad.business.interfaces.UsuarioAdditionable;
import com.bydan.framework.ingles.business.logic.DatosCliente;
//import com.bydan.framework.ingles.util.*;
//import com.bydan.ingles.seguridad.business.dataaccess.*;
//import com.bydan.ingles.seguridad.business.logic.*;
//import com.bydan.framework.ingles.business.logic.*;
//import java.sql.SQLException;

@SuppressWarnings("unused")
final public class UsuarioSql {		
	public  UsuarioSql()throws Exception {
		
    }		
	
	public static String GetWhereValidarUsuario(ConnexionType connexionType,ParameterDbType parameterDbType,String sLogin,String sClaveDesencriptada) throws Exception {
		String sSql="";
		
		if(connexionType.equals(ConnexionType.HIBERNATE)) {
			sSql=" where user_name='"+sLogin+"'"+" and clave='"+sClaveDesencriptada+"'";
			
		} else if(connexionType.equals(ConnexionType.JDBC32)) {
			
			if(parameterDbType.equals(ParameterDbType.MYSQL)) {
				sSql=" where user_name='"+sLogin+"'"+" and clave='"+sClaveDesencriptada+"'";
				
			} else if(parameterDbType.equals(ParameterDbType.SQLITE)) {
				sSql=" where user_name='"+sLogin+"'"+" and clave='"+sClaveDesencriptada+"'";
				
			} else if(parameterDbType.equals(ParameterDbType.POSTGRES)) {
				sSql=" where user_name='"+sLogin+"'"+" and clave='"+sClaveDesencriptada+"'";
			}
		}
		
		return sSql;
	}
	
	public static String GetWhereValidarUsuarioCambioClave(ConnexionType connexionType,ParameterDbType parameterDbType,Long idUsuario) throws Exception {
		String sSql="";
		
		if(connexionType.equals(ConnexionType.HIBERNATE)) {
			sSql=" where id_usuario="+idUsuario+" order by fecha_hora desc ";
			
		} else if(connexionType.equals(ConnexionType.JDBC32)) {
			
			if(parameterDbType.equals(ParameterDbType.MYSQL)) {
				sSql=" where id_usuario="+idUsuario+" order by fecha_hora desc ";
				
			} else if(parameterDbType.equals(ParameterDbType.POSTGRES)) {
				sSql=" where id_usuario="+idUsuario+" order by fecha_hora desc ";
			}
		}
		
		return sSql;
	}
}

