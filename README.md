 ## This example used
  
  Java 8, Maven 3 and Wildfly-14.0.1.Final
 ------------------------------------------------------------------------------
 1. Clone this repo and call `mvn clean install`.
 2. Move the `example-1.0.0.war` file from the `target` directory to the Wildfly directory called `bin`.
 3. Go to the `bin` directory where your WildFly and run WildFly by calling `domain.sh`.
 4. Deploy the application using `jboss-cli.sh`, the `domain.sh` need to be still running. Run:
    ./jboss-cli.sh -c --controller=127.0.0.1:9990
    [domain@127.0.0.1:9990 /] deploy example-1.0.0.war --server-groups=main-server-group
 5. Open <http://localhost:8080> and you will see:
Showing the application ports. Port by Controller request: '8080', Port By Autowiring field:'8080'
  Open <http://localhost:8230> and you will see:
Showing the application ports. Port by Controller request: '8230', Port By Autowiring field:'8230'