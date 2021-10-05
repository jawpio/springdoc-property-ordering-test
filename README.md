# springdoc-property-ordering-test

Use `mvn spring-boot:run` to run see http://localhost:8080/swagger-ui.html for UI or http://localhost:8080/v3/api-docs to see generated content content as json or http://localhost:8080/v3/api-docs.yaml as yaml.

Change the `springdoc.api-docs.resolve-schema-properties` from the application.yaml to see:
  * false - property order for the SampleResponseClass is the same as in the class.
  * true - property order for the SampleResponseClass is random.