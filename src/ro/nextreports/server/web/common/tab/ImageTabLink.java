/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.nextreports.server.web.common.tab;

import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.image.ContextImage;

/**
 * @author Decebal Suiu
 */
public abstract class ImageTabLink extends AjaxFallbackLink<String> {
	
	private static final long serialVersionUID = 1L;
	
	/*
	public ImageTabLink(String id, ResourceReference image) {
		super(id);
		
		add(new Image("image", image));
	}
	*/	

	public ImageTabLink(String id, String imageName) {
		super(id);
		
		add(new ContextImage("image", imageName));
	}	
	
}
