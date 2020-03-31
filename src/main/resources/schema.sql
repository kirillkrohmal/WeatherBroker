CREATE TABLE location (
  city    SERIAL PRIMARY KEY,
  country VARCHAR(200),
  region  VARCHAR(200)
);

CREATE TABLE Atmosphere (
  humidity      SERIAL PRIMARY KEY,
  pressure      VARCHAR(200),
  rising        VARCHAR(200),
  visibility    VARCHAR(200),
  location_city INT NOT NULL REFERENCES location (city)
);

CREATE TABLE Astronomy (
  sunrise VARCHAR(200),
  sunset  VARCHAR(200)
);

CREATE TABLE Forecast (
  code SERIAL PRIMARY KEY,
  date CHARACTER VARYING,
  day  TIMESTAMP NOT NULL DEFAULT now(),
  high INT       NOT NULL REFERENCES location (city),
  low  INT       NOT NULL REFERENCES location (city),
  text INT       NOT NULL REFERENCES location (city)
);
CREATE TABLE Wind (
  chill     SERIAL PRIMARY KEY,
  direction CHARACTER VARYING,
  speed     TIMESTAMP NOT NULL DEFAULT now()
);
