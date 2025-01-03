This is a simple Java-based Client-Server Chatbox application built using Java Socket programming. The application allows two or more users to communicate with each other over a network using a client-server model.


FEATURES:
Real-time text-based chat.
Server handles multiple clients using threading.
Efficient message broadcasting to all connected clients.
Easy-to-understand code structure for learning purposes.


RUN THE SERVER:
Start the server by running:
java Server

RUN THE CLIENTS:
In separate terminals, start the clients by running:
java Client


HOW IT WORKS
SERVER:
The server listens for incoming client connections on a specified port.
It creates a dedicated thread for each connected client to handle communication.
Messages from one client are broadcast to all connected clients.
CLIENT:
The client connects to the server.
The client can communicate to other clients.
The Server sends message to every client on disconnecting and connecting of a new client. 


USAGE
Start the Server: Ensure the server is running before starting the clients.
Connect Clients: Run the Client program on multiple machines or instances to join the chat.
Start Chatting: Type and send messages via the client console.
Stop the chat: Terminate the client.


KNOWN ISSUES
Limited error handling.
Messages are sent as plain text and are not encrypted.
Server does not persist chat history after termination.


FUTURE IMPROVEMENTS
Implement a graphical user interface (GUI).
Add encryption for secure communication.
Save chat logs to a file or database.
Improve error handling and connection resilience.

