from diagrams import Diagram, Edge
from diagrams.onprem.compute import Server
from diagrams.onprem.database import MongoDB
from diagrams.onprem.network import Nginx
from diagrams.onprem.security import Vault
from diagrams.custom import Custom
from diagrams.programming.framework import React, Spring


with Diagram(name="Deployment diagram", show=False):
    proxy = Nginx("Proxy-Load Balancer")
    client = React("Client")
    server = Spring("Server")
    db = MongoDB("Mongo DB")
    dbexpress = MongoDB("Mongo DB Express")
    #vault = Vault("Vault")
    user = Custom("User", "./my_resources/user.png")

    user >> Edge(label="http://localhost:9090") >> proxy
    proxy >> client
    client >> Edge(label="http://localhost:8080") >> server

    server >> Edge(label="http://localhost:27017") >>  db

    user >> Edge(label="http://localhost:8081") >> dbexpress

  