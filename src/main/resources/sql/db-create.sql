
CREATE TABLE IF NOT EXISTS SiteUser();
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS userId text;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS userName text;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS userEmail text;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS userFirstName text;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS userLastName text;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS userFullName text;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS seeArchived boolean;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS seeDeleted boolean;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS pk bigserial primary key;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS inheritPk text;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS created timestamp with time zone;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS archived boolean;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS deleted boolean;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS sessionId text;
ALTER TABLE SiteUser ADD COLUMN IF NOT EXISTS userKey bigint;

CREATE TABLE IF NOT EXISTS SimulationReport();
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS reportName text;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS location point;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS simulationKey bigint references TrafficSimulation(pk);
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS smartTrafficLightKey bigint references SmartTrafficLight(pk);
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS simulationName text;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS smartTrafficLightId text;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS smartTrafficLightName text;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramAvgVehiclePerMinFromWestToEast decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramAvgVehiclePerMinFromSouthToNorth decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramVehicleDemandScalingFactor decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramAvgPedestrianPerMinFromWestToEast decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramAvgPedestrianPerMinFromSouthToNorth decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramPedestrianDemandScalingFactor decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramMinGreenTimeSecWestEast decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramMaxGreenTimeSecWestEast decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramMinGreenTimeSecSouthNorth decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramMaxGreenTimeSecSouthNorth decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramPedestrianWaitThresholdSecNorthSouth decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramPedestrianWaitThresholdSecWestEast decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramVehicleQueueThresholdWestEast decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramVehicleQueueThresholdSouthNorth decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramPedestrianQueueThresholdNorthSouth decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramPedestrianQueueThresholdWestEast decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramDemandScale decimal[];
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramStepSize decimal;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramRunTime integer;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramItersPerPar integer;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS paramTotalIterNum integer;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS updatedParameters jsonb;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS updatedPerformance jsonb;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS averageQueueLength jsonb;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS reportStatus text;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS reportProgress integer;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS pk bigserial primary key;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS inheritPk text;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS created timestamp with time zone;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS archived boolean;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS deleted boolean;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS sessionId text;
ALTER TABLE SimulationReport ADD COLUMN IF NOT EXISTS userKey bigint;

CREATE TABLE IF NOT EXISTS SmartTrafficLight();
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS entityId text;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS smartTrafficLightName text;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS routeIds text[];
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS routeIdNorth text;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS routeIdEast text;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS paramVehicleDemandScalingFactor decimal;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS paramStepSize decimal;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS paramRunTime integer;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS paramItersPerPar integer;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS paramTotalIterNum integer;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS pk bigserial primary key;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS inheritPk text;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS created timestamp with time zone;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS archived boolean;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS deleted boolean;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS sessionId text;
ALTER TABLE SmartTrafficLight ADD COLUMN IF NOT EXISTS userKey bigint;

CREATE TABLE IF NOT EXISTS TrafficFlowObserved();
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS color text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS entityId text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS trafficSimulationId text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS laneAreaDetectorId text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS location point;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS simulationName text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS sumocfgPath text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customTrafficLightId text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS address jsonb;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS alternateName text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS areaServed path;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS averageGapDistance decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS averageHeadwayTime decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS averageVehicleLength decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS averageVehicleSpeed decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS congested boolean;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS dataProvider text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS dateCreated text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS dateModified text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS dateObserved text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS dateObservedFrom text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS dateObservedTo text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS description text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS intensity decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS laneDirection text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS laneId integer;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS name text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS occupancy decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS owner jsonb;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS refRoadSegment text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS reversedLane boolean;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS seeAlso jsonb;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS source text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS vehicleSubType text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS vehicleType text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customSigma decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customAcceleration decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customDeceleration decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customMinGreenTime decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customMaxGreenTime decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customAverageVehiclesPerMinute decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customDemandScalingFactor decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS customQueueLengthThreshold decimal;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS pk bigserial primary key;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS inheritPk text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS created timestamp with time zone;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS archived boolean;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS deleted boolean;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS sessionId text;
ALTER TABLE TrafficFlowObserved ADD COLUMN IF NOT EXISTS userKey bigint;

CREATE TABLE IF NOT EXISTS TrafficSimulation();
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS startDateTime timestamp with time zone;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS simulationName text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS entityId text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS location point;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS sumocfgPath text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS fcdFilePath text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS netFilePath text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS startSeconds decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS endSeconds decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS stepSeconds decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramAvgVehiclePerMinFromWestToEast decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramAvgVehiclePerMinFromSouthToNorth decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramVehicleDemandScalingFactor decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramAvgPedestrianPerMinFromWestToEast decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramAvgPedestrianPerMinFromSouthToNorth decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramPedestrianDemandScalingFactor decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramDemandScale decimal[];
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramMinGreenTimeSecWestEast decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramMaxGreenTimeSecWestEast decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramMinGreenTimeSecSouthNorth decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramMaxGreenTimeSecSouthNorth decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramPedestrianWaitThresholdSecNorthSouth decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramPedestrianWaitThresholdSecWestEast decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramVehicleQueueThresholdWestEast decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramVehicleQueueThresholdSouthNorth decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramPedestrianQueueThresholdNorthSouth decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramPedestrianQueueThresholdWestEast decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramStepSize decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramRunTime integer;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramItersPerPar integer;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS paramTotalIterNum integer;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS laneAreaDetectorIds text[];
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS laneAreaDetectorLanes jsonb;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS laneAreaDetectorPaths text[];
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS e1DetectorIds text[];
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS e1DetectorLanes text[];
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS e1DetectorPaths text[];
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS walkingAreaIds text[];
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS walkingAreaLanes jsonb;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS pk bigserial primary key;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS inheritPk text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS created timestamp with time zone;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS archived boolean;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS deleted boolean;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS sessionId text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS userKey bigint;

CREATE TABLE IF NOT EXISTS CrowdFlowObserved();
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS color text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS entityId text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS trafficSimulationId text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS walkingAreaId text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS alternateName text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS areaServed polygon;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS averageCrowdSpeed decimal;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS averageHeadwayTime decimal;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS congested boolean;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS dataProvider text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS dateCreated text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS dateModified text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS dateObserved text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS dateObservedFrom text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS dateObservedTo text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS description text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS direction text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS location point;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS name text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS occupancy decimal;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS owner jsonb;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS peopleCount integer;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS refRoadSegment jsonb;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS seeAlso jsonb;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS source text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS pk bigserial primary key;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS inheritPk text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS created timestamp with time zone;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS archived boolean;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS deleted boolean;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS sessionId text;
ALTER TABLE CrowdFlowObserved ADD COLUMN IF NOT EXISTS userKey bigint;
