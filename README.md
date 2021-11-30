# Instructions


### Create the React Client

`npx create-react-app client` 


## Docker images configuration

Create network before starting docker-compose:
`docker network create mongodb_network`


# Run applications 

> Start the database server
`docker-compose up`

> Start the SpringBoot backend application
`mvn clean install`
`mvn spring-boot:run`

> Start the React client
`npm start`