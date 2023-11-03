/*
 * Copyright (c) 2018-2022 Computate Limited Liability Company in Utah, USA,
 * and the Smarta Byar Smart Village FIWARE IHub. 
 *
 * This program and the accompanying materials are made available under the
 * terms of the GNU GENERAL PUBLIC LICENSE Version 3 which is available at
 * 
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 * 
 * You may not propagate or modify a covered work except as expressly provided 
 * under this License. Any attempt otherwise to propagate or modify it is void, 
 * and will automatically terminate your rights under this License (including 
 * any patent licenses granted under the third paragraph of section 11).
 */
package org.computate.smartvillage.enus.vertx;

import static org.apache.commons.lang3.Validate.isTrue;

import java.io.IOException;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;

public enum ProjectHelpers implements Helper<Object> {


	/**
	 * Return true if the value is an even number, otherwise false
	 */
	numberAdd{
		@Override
		public Object apply(final Object value, final Options options) throws IOException {
			isTrue(value instanceof Number, "found '%s', expected 'number'", value);
			Number number1 = (Number) value;
			Object object2 = options.param(0);
			isTrue(object2 instanceof Number, "found '%s', expected 'number'", object2);
			Number number2 = (Number) object2;
			if(number1 instanceof Integer && number2 instanceof Integer)
				return (Integer)number1 + (Integer)number2;
			else if(number1 instanceof Double && number2 instanceof Double)
				return (Double)number1 + (Double)number2;
			else
				return null;
		}
	}
	;
}
