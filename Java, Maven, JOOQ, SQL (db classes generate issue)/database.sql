CREATE DATABASE "library";

USE "library";

CREATE TABLE "author" (
  "id" int NOT NULL PRIMARY KEY,
  "first_name" varchar(255) DEFAULT NULL,
  "last_name" varchar(255) DEFAULT NULL
);

INSERT INTO "author" VALUES (1, 'Hello', 'Koding');
INSERT INTO "author" VALUES (2, 'jOOQ', 'Example');