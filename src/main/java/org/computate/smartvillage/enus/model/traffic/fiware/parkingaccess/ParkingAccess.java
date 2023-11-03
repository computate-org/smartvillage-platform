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
package org.computate.smartvillage.enus.model.traffic.fiware.parkingaccess;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillage.enus.model.base.BaseModel;
import org.computate.smartvillage.enus.model.traffic.fiware.parkingaccess.ParkingAccessGen;

import io.vertx.core.json.JsonObject;
import io.vertx.pgclient.data.Path;
import io.vertx.pgclient.data.Polygon;

/**
* SmartDataModel: ParkingAccess - Parking - SmartCities
* Fiware: true

* Model: true
* SqlOrder: 1
* Api: true
* Page: true
* SuperPage.enUS: BaseModelPage
* Indexed: true
* Order: 1
* Description: 
* ApiTag.enUS: ParkingAccess
* ApiUri.enUS: /api/parking-access

* ApiMethod.enUS: Search
* ApiMethod: GET
* ApiMethod: PATCH
* ApiMethod: POST
* ApiMethod: PUTImport

* ApiMethod.enUS: SearchPage
* Page.SearchPage.enUS: ParkingAccessPage
* ApiUri.SearchPage.enUS: /parking-access

* Role.enUS: SiteAdmin

* AName.enUS: a ParkingAccess
* Color: 2017-shaded-spruce
* IconGroup: duotone
* IconName: map-location-dot
* Rows: 100
**/
public class ParkingAccess extends ParkingAccessGen<BaseModel> {

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: address
* Description: The mailing address
* HtmRow: 3
* HtmCell: 1
* Facet: true
**/
protected void _address(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: alternate name
* Description: An alternative name for this item
* HtmRow: 3
* HtmCell: 2
* Facet: true
**/
protected void _alternateName(Wrap<String> w) {}

/**
* {@inheritDoc}}
* FiwareType: geo:linestring
* Location: true
* DocValues: true
* Persist: true
* DisplayName: area served
* Description: The geographic area where a service or offered item is provided
* HtmRow: 3
* HtmCell: 3
* Facet: true
**/
protected void _areaServed(Wrap<Polygon> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: category
* Description: Category of the access point (entrance, exit, etc.). Allowed values: Those specified by the DATEX II _AccessCategoryEnum_ or other values meaningful to the application.
* HtmRow: 4
* HtmCell: 1
* Facet: true
**/
protected void _category(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: data provider
* Description: A sequence of characters identifying the provider of the harmonised data entity.
* HtmRow: 4
* HtmCell: 2
* Facet: true
**/
protected void _dataProvider(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: date created
* Description: Entity creation timestamp. This will usually be allocated by the storage platform.
* HtmRow: 4
* HtmCell: 3
* Facet: true
**/
protected void _dateCreated(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: date modified
* Description: Timestamp of the last modification of the entity. This will usually be allocated by the storage platform.
* HtmRow: 5
* HtmCell: 1
* Facet: true
**/
protected void _dateModified(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: description
* Description: A description of this item
* HtmRow: 5
* HtmCell: 2
* Facet: true
**/
protected void _description(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: features
* Description: Those specified by the DATEX II _essEquipmentEnum_ and by _AccessibilityEnum_ or other values meaningful to the application.
* HtmRow: 5
* HtmCell: 3
* Facet: true
**/
protected void _features(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: height
* Description: Height of the access point
* HtmRow: 6
* HtmCell: 1
* Facet: true
**/
protected void _height(Wrap<BigDecimal> w) {}

/**
* {@inheritDoc}}
* FiwareType: geo:point
* DocValues: true
* Persist: true
* DisplayName: location
* Description: Geojson reference to the item. It can be Point, LineString, Polygon, MultiPoint, MultiLineString or MultiPolygon
* HtmRow: 6
* HtmCell: 2
* Facet: true
**/
protected void _location(Wrap<Path> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: name
* Description: The name of this item.
* HtmRow: 6
* HtmCell: 3
* Facet: true
**/
protected void _name(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: owner
* Description: A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)
* HtmRow: 7
* HtmCell: 1
* Facet: true
**/
protected void _owner(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: ref off street parking
* Description: The offstreet parking site this access point gives access to.
* HtmRow: 7
* HtmCell: 2
* Facet: true
**/
protected void _refOffStreetParking(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: see also
* Description: list of uri pointing to additional resources about the item
* HtmRow: 7
* HtmCell: 3
* Facet: true
**/
protected void _seeAlso(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: slope
* Description: Slope of the access point (in relative terms)
* HtmRow: 8
* HtmCell: 1
* Facet: true
**/
protected void _slope(Wrap<BigDecimal> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: source
* Description: A sequence of characters giving the original source of the entity data as a URL. Recommended to be the fully qualified domain name of the source provider, or the URL to the source object.
* HtmRow: 8
* HtmCell: 2
* Facet: true
**/
protected void _source(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: width
* Description: Width of the access point
* HtmRow: 8
* HtmCell: 3
* Facet: true
**/
protected void _width(Wrap<BigDecimal> w) {}
}
