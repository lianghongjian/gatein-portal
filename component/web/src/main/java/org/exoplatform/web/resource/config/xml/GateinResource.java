/**
 * Copyright (C) 2009 eXo Platform SAS.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.exoplatform.web.resource.config.xml;

import org.w3c.dom.Element;

/**
 * 
 * Created by eXoPlatform SAS
 * 
 * Author: Minh Hoang TO - hoang281283@gmail.com
 * 
 * Sep 17, 2009
 */
public interface GateinResource
{

   final public static String JAVA_SCRIPT_TAG = "javascript";

   final public static String JAVA_SCRIPT_PARAM = "param";

   final public static String JAVA_SCRIPT_MODULE = "js-module";

   final public static String JAVA_SCRIPT_PATH = "js-path";

   final public static String JAVA_SCRIPT_PRIORITY = "js-priority";

   public void binding(Element elemt);
}
