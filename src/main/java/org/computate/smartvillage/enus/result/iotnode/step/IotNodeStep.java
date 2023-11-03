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
package org.computate.smartvillage.enus.result.iotnode.step;

import java.math.BigDecimal;
import java.util.Optional;

import org.apache.commons.lang3.math.NumberUtils;
import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.result.base.BaseResult;
import org.computate.smartvillage.enus.result.iotnode.step.IotNodeStepGen;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.pgclient.data.Point;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseResultPage
 * Indexed: true
 * Order: 6
 * 
 * ApiTag.enUS: IOT Node Step
 * ApiUri.enUS: /api/iot-node-step
 * 
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod: SearchPage
 * Page.SearchPage.enUS: IotNodeStepPage
 * ApiUri.SearchPage.enUS: /iot-node-step
 * 
 * Role.enUS: SiteAdmin
 * 
 * AName.enUS: an IOT node step
 * Color: 2017-shaded-spruce
 * IconGroup: duotone
 * IconName: router
 * Rows: 100
 */
public class IotNodeStep extends IotNodeStepGen<BaseResult> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: json
	 */
	protected void _json(Wrap<JsonObject> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: node name
	 * HtmRow: 3
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _nodeName(Wrap<String> w) {
		w.o(json.getString("name"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: node type
	 * HtmRow: 3
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _nodeType(Wrap<String> w) {
		w.o(json.getString("nodeType"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: node ID
	 * HtmRow: 3
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _nodeId(Wrap<String> w) {
		w.o(json.getString("_id"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: map location
	 * HtmRow: 4
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _location(Wrap<Point> w) {
		JsonArray latlng = json.getJsonArray("latlng");
		if(latlng != null && latlng.size() == 2) {
			w.o(new Point(latlng.getDouble(0), latlng.getDouble(1)));
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: moisture
	 * HtmRow: 4
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_moisture(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("moisture")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: moisture0
	 * HtmRow: 4
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_moisture0(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("moisture0")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: moisture1
	 * HtmRow: 4
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_moisture1(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("moisture1")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: temperature
	 * HtmRow: 5
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _json_temperature(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("temperature")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: temperature0
	 * HtmRow: 5
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_temperature0(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("temperature0")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: average temperature
	 * HtmRow: 5
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_temperatureAverage(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("temperatureAverage")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: bad conditions counter
	 * HtmRow: 5
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_badConditionsCounter(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("badConditionsCounter")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: door
	 * Description: Door open or closed. 
	 * HtmRow: 6
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _json_door(Wrap<String> w) {
		w.o(json.getString("door"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: alarm door
	 * HtmRow: 6
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_alarmDoor(Wrap<Boolean> w) {
		w.o(json.getBoolean("alarmDoor"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: flood
	 * HtmRow: 6
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_flood(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("flood")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: alarm flood
	 * HtmRow: 6
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_alarmFlood(Wrap<Boolean> w) {
		w.o(json.getBoolean("alarmFlood"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: lux2
	 * HtmRow: 7
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _json_lux2(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("lux2")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: illuminance
	 * Description: The amount of luminous flux per unit area. 
	 * HtmRow: 7
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_illuminance(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("illuminance")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: resistance0
	 * HtmRow: 7
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_resistance0(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("resistance0")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: resistance1
	 * HtmRow: 7
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_resistance1(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("resistance1")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: frequency
	 * HtmRow: 8
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _json_frequency(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getValue("frequency")).map(v -> v instanceof Double ? (Double)v : Double.parseDouble(v.toString())).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: extended unique identifier
	 * Description: The DevEUI is a 64-bit globally-unique Extended Unique Identifier (EUI-64) assigned by the manufacturer, or the owner, of the end-device. 
	 * HtmRow: 8
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_devEui(Wrap<String> w) {
		w.o(json.getString("devEui"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: bandwidth
	 * Description: A range of frequencies within a given band, in particular that used for transmitting a signal. 
	 * HtmRow: 8
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_bandwidth(Wrap<String> w) {
		w.o(json.getString("bandwidth"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: frequency
	 * Description: The speed at which data is transferred within the computer or between a peripheral device and the computer, measured in bytes per second. 
	 * HtmRow: 8
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_dataRate(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("dataRate")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: frame count
	 * Description: The number of frames that have been displayed since the reading started. 
	 * HtmRow: 9
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _json_frameCount(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("frameCount")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: max payload
	 * HtmRow: 9
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_maxPayload(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("maxPayload")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: bits per second
	 * HtmRow: 9
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_bitsPerSecond(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("bitsPerSecond")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: battery voltage
	 * HtmRow: 9
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_batteryVoltage(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("batteryVoltage")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: spreading factor
	 * Description: Spreading factors plays a significant role in enabling multiple long-range receptions of packets with every packet assigned a different spreading factor. 
	 * HtmRow: 10
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _json_spreadingFactor(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("spreadingFactor")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: adaptive data rate
	 * Description: Adaptive Data Rate (ADR) is a mechanism for optimizing data rates, airtime and energy consumption in the network. 
	 * HtmRow: 10
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_dataRateAdaptive(Wrap<Boolean> w) {
		w.o(json.getBoolean("dataRateAdaptive"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: swversion
	 * HtmRow: 10
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_swversion(Wrap<String> w) {
		w.o(json.getString("swversion"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: battery level
	 * HtmRow: 10
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_batteryLevel(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("batteryLevel")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: startup count
	 * HtmRow: 11
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _json_startUpCount(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("startUpCount")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: watchdog count
	 * HtmRow: 11
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_watchdogCount(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("watchdogCount")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: history sequence
	 * HtmRow: 11
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_historySequence(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("historySequence")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: firmware version
	 * HtmRow: 11
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_versionFirmware(Wrap<String> w) {
		w.o(json.getString("versionFirmware"));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: stack tx fail reboot count
	 * HtmRow: 12
	 * HtmCell: 1
	 * Facet: true
	 */
	protected void _json_stackTxFailRebootCount(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("stackTxFailRebootCount")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: history sequence previous
	 * HtmRow: 12
	 * HtmCell: 2
	 * Facet: true
	 */
	protected void _json_historySequencePrevious(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("historySequencePrevious")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: signal-to-noise ratio
	 * Description: SNR is defined as the ratio of signal power to the noise power, often expressed in decibels. 
	 * HtmRow: 12
	 * HtmCell: 3
	 * Facet: true
	 */
	protected void _json_snr(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("snr")).map(d -> new BigDecimal(d)).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * DisplayName: received signal strength indicator
	 * Description: RSSI is a measurement of how well your device can hear a signal from an access point or router. 
	 * HtmRow: 12
	 * HtmCell: 4
	 * Facet: true
	 */
	protected void _json_rssi(Wrap<BigDecimal> w) {
		w.o(Optional.ofNullable(json.getDouble("rssi")).map(d -> new BigDecimal(d)).orElse(null));
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		b.append(nodeName);
		w.o(b.toString());
	}

	public void indexJsonObject(JsonObject doc, String prefix, JsonObject json) {
		json.forEach(entry -> {
			String key = entry.getKey();
			Object value = entry.getValue();
			if(value instanceof JsonArray) {
				if(value != null)
					doc.put(String.format("%s_%s_docvalues_strings", prefix, key), value.toString());
			} else if(value instanceof JsonObject) {
				indexJsonObject(doc, String.format("%s_%s", prefix, key), (JsonObject)value);
			} else if(value != null) {
				if(NumberUtils.isCreatable(value.toString()))
					doc.put(String.format("%s_%s_docvalues_double", prefix, key), value.toString());
				else
					doc.put(String.format("%s_%s_docvalues_string", prefix, key), value.toString());
			}
		});
	}
}
