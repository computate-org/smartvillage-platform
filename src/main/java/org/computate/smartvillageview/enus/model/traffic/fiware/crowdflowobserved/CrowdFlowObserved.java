package org.computate.smartvillageview.enus.model.traffic.fiware.crowdflowobserved;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.model.base.BaseModel;

import io.vertx.core.json.JsonObject;
import io.vertx.pgclient.data.Path;

/**
* SmartDataModel: CrowdFlowObserved - Transportation - SmartCities
* Fiware: true
* SqlOrder: 1
* Api: true
* Page: true
* SuperPage.enUS: BaseModelPage
* Indexed: true
* Order: 1
* Description: 
* ApiTag.enUS: CrowdFlowObserved
* ApiUri.enUS: /api/CrowdFlowObserved

* ApiMethod.enUS: Search
* ApiMethod: GET
* ApiMethod: PATCH
* ApiMethod: POST
* ApiMethod: PUTImport

* ApiMethod.enUS: SearchPage
* Page.SearchPage.enUS: CrowdFlowObservedPage
* ApiUri.SearchPage.enUS: /CrowdFlowObserved

* Role.enUS: SiteAdmin

* AName.enUS: a CrowdFlowObserved
* Color: 2017-shaded-spruce
* IconGroup: duotone
* IconName: map-location-dot
* Rows: 100
**/
public class CrowdFlowObserved extends CrowdFlowObservedGen<BaseModel> {

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
* DocValues: true
* Persist: true
* DisplayName: area served
* Description: The geographic area where a service or offered item is provided
* HtmRow: 3
* HtmCell: 3
* Facet: true
**/
protected void _areaServed(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: average crowd speed
* Description: Average speed of the crowd transiting during the observation period
* HtmRow: 4
* HtmCell: 1
* Facet: true
**/
protected void _averageCrowdSpeed(Wrap<BigDecimal> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: average headway time
* Description: Average headway time. Headway time is the time elapsed between two consecutive persons
* HtmRow: 4
* HtmCell: 2
* Facet: true
**/
protected void _averageHeadwayTime(Wrap<BigDecimal> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: congested
* Description: Flags whether there was a crowd congestion during the observation period in the referred walkway. The absence of this attribute means no crowd congestion
* HtmRow: 4
* HtmCell: 3
* Facet: true
**/
protected void _congested(Wrap<Boolean> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: data provider
* Description: A sequence of characters identifying the provider of the harmonised data entity.
* HtmRow: 5
* HtmCell: 1
* Facet: true
**/
protected void _dataProvider(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: date created
* Description: Entity creation timestamp. This will usually be allocated by the storage platform.
* HtmRow: 5
* HtmCell: 2
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
* HtmCell: 3
* Facet: true
**/
protected void _dateModified(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: date observed
* Description: The date and time of this observation in ISO8601 UTC format. It can be represented by an specific time instant or by an ISO8601 interval. As a workaround for the lack of support of Orion Context Broker for datetime intervals, it can be used two separate attributes: `dateObservedFrom`, `dateObservedTo`
* HtmRow: 6
* HtmCell: 1
* Facet: true
**/
protected void _dateObserved(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: date observed from
* Description: Observation period start date and time. See `dateObserved`.
* HtmRow: 6
* HtmCell: 2
* Facet: true
**/
protected void _dateObservedFrom(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: date observed to
* Description: Observation period end date and time. See `dateObserved`.
* HtmRow: 6
* HtmCell: 3
* Facet: true
**/
protected void _dateObservedTo(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: description
* Description: A description of this item
* HtmRow: 7
* HtmCell: 1
* Facet: true
**/
protected void _description(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: direction
* Description: Usual direction of travel in the walkway referred by this observation with respect to the city center. Enum:'inbound, outbound'
* HtmRow: 7
* HtmCell: 2
* Facet: true
**/
protected void _direction(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: location
* Description: Geojson reference to the item. It can be Point, LineString, Polygon, MultiPoint, MultiLineString or MultiPolygon
* HtmRow: 7
* HtmCell: 3
* Facet: true
**/
protected void _location(Wrap<Path> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: name
* Description: The name of this item.
* HtmRow: 8
* HtmCell: 1
* Facet: true
**/
protected void _name(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: occupancy
* Description: Fraction of the observation time where a person has been occupying the observed walkway
* HtmRow: 8
* HtmCell: 2
* Facet: true
**/
protected void _occupancy(Wrap<BigDecimal> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: owner
* Description: A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)
* HtmRow: 8
* HtmCell: 3
* Facet: true
**/
protected void _owner(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: people count
* Description: Total number of people detected during this observation.
* HtmRow: 9
* HtmCell: 1
* Facet: true
**/
protected void _peopleCount(Wrap<Integer> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: ref road segment
* Description: Concerned road segment on which the observation has been made
* HtmRow: 9
* HtmCell: 2
* Facet: true
**/
protected void _refRoadSegment(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: see also
* Description: list of uri pointing to additional resources about the item
* HtmRow: 9
* HtmCell: 3
* Facet: true
**/
protected void _seeAlso(Wrap<JsonObject> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: source
* Description: A sequence of characters giving the original source of the entity data as a URL. Recommended to be the fully qualified domain name of the source provider, or the URL to the source object.
* HtmRow: 10
* HtmCell: 1
* Facet: true
**/
protected void _source(Wrap<String> w) {}

/**
* {@inheritDoc}}
* DocValues: true
* Persist: true
* DisplayName: type
* Description: NGSI Entity type. It has to be CrowdFlowObserved
* HtmRow: 10
* HtmCell: 2
* Facet: true
**/
protected void _type(Wrap<String> w) {}
}
