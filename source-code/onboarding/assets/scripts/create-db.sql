-- Creación Base de datos Onboarding Digital
--------------------------------------------------------
CREATE USER onboarding WITH
    LOGIN
    NOSUPERUSER
    INHERIT
    NOCREATEDB
    NOCREATEROLE
    NOREPLICATION;
--Cambiar contrasenia del usuario
ALTER USER onboarding WITH PASSWORD 'onboarding';
--crear una base de datos con propietario especifico
CREATE DATABASE onboarding WITH OWNER onboarding;
--Asignar privilegios al usuario de de la base de datos
GRANT ALL PRIVILEGES ON DATABASE onboarding TO onboarding;