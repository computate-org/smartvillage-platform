package org.computate.smartvillageview.enus.tool;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Convert degrees to heading names User: mduffy Date: 7/21/2016 Time: 7:49 AM
 * 
 * @link http://stackoverflow.com/questions/38503399/what-is-the-best-way-to-convert-degrees-to-quadrant-names
 */
public class HeadingConverter {

	private static final Map<Double, String> DEGREES_TO_HEADING;

	// TODO: You need to add more to the Map
	static {
		DEGREES_TO_HEADING = new LinkedHashMap<Double, String>() {
			{
				put(0.0, "N");
				put(45.0, "NE");
				put(90.0, "E");
				put(135.0, "SE");
				put(180.0, "S");
				put(225.0, "SW");
				put(270.0, "W");
				put(315.0, "NW");
				put(360.0, "N");
			}
		};
	}

	public static double normalizeDegrees(double unnormalized) {
		return unnormalized - 22.5;
	}

	public static String getHeading(BigDecimal unnormalized) {
		return getHeading(unnormalized.doubleValue());
	}

	public static String getHeading(double unnormalized) {
		String heading = "UNKNOWN";
		double normalized = normalizeDegrees(unnormalized);
		for (Double angle : DEGREES_TO_HEADING.keySet()) {
			if (normalized <= angle) {
				heading = DEGREES_TO_HEADING.get(angle);
				break;
			}
		}
		return heading;
	}
}
