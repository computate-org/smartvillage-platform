
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

CREATE TABLE IF NOT EXISTS TrafficSimulation();
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS simulationName text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS sumocfgPath text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS fcdFilePath text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS netFilePath text;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS startDateTime timestamp with time zone;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS startSeconds decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS endSeconds decimal;
ALTER TABLE TrafficSimulation ADD COLUMN IF NOT EXISTS stepSeconds decimal;
