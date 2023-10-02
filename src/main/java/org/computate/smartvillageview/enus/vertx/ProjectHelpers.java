package org.computate.smartvillageview.enus.vertx;

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
