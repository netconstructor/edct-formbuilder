/*L
 * Copyright HealthCare IT, Inc.
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/edct-formbuilder/LICENSE.txt for details.
 */


package com.healthcit.cacure.web.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.healthcit.cacure.utils.Constants;

/**
 * Base class for libraries editing controllers
 *
 */
public class BaseLibraryEditController extends BaseModuleEditController {
	
	public static final String CANCEL_URL = "cancelUrl";
	
	@ModelAttribute(CANCEL_URL)
	public String getCancelUrl()
	{
		return Constants.LIBRARY_MANAGE_URI;
	}
}
