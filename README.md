# Web Socket Microservices Example

## How to use this

1. Build the application

   ```
   mvn clean package
   ```

2. Start the server

   ```
   java -cp target/websocket-book-service-0.0.1-SNAPSHOT.jar uk.co.nstech.websockets.adderservice.AdderService
   Starting Server...
   ```

3. Run the client

   ```
   java -cp target/websocket-book-service-0.0.1-SNAPSHOT.jar uk.co.nstech.websockets.adderservice.WebSocketAdderClient
   Client
   3
   ```
